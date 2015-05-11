package com.example.listviewtest;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;


import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class LoginActivity extends Activity implements View.OnClickListener {

    private EditText accountText, passwordText;
    private String inpAccount, inpPassword;
    private ImageView goButton;
    private InputStream in;
    private DataOutputStream out;
    private ReturnLoginMessage reMessage;

    final private String EMPTY_PASSWORD_MESSAGE = "抱歉，您输入的账号或密码为空";
    final private String WRONG_PASSWORD_MESSAGE = "抱歉，您输入的账号或密码有误";
    final private String NETWORK_ERROR_MESSAGE = "抱歉，请检查您的网络状态";
    //final private String UNKNOWN_ERROR_MESSAGE = "抱歉，出现了奇怪的错误";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initResource();
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            We.logcat("klasdlfkljasjlklkadfjkasdjkfk");
            We.postToast(LoginActivity.this, (String) msg.obj);
        }
    };

    public void initResource() {
        goButton = (ImageView) findViewById(R.id.go_button);
        accountText = (EditText) findViewById(R.id.account);
        passwordText = (EditText) findViewById(R.id.password);

        goButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.go_button:
                isRight(new MyCallBack() {
                    @Override
                    public void toDo() {
                        MainActivity.actionStart(LoginActivity.this, inpAccount, inpPassword, reMessage.getData());
                    }
                });
                break;
        }
    }

    public void isRight(final MyCallBack myCallBack) {
        inpAccount = accountText.getText().toString();
        inpPassword = passwordText.getText().toString();
        if (inpAccount.equals("") || inpPassword.equals("")) {
            Message message  = new Message();
            message.obj = EMPTY_PASSWORD_MESSAGE;
            handler.sendMessage(message);
            return;
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                Message message = new Message();
                try {
                    URL url = new URL("http://redrock.hotwoo.cn/login.php");
                    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                    connection.setRequestMethod("POST");
                    connection.setDoOutput(true);
                    StringBuffer params = new StringBuffer();
                    params.append("name=").append(inpAccount).append("&password=").append(inpPassword);
                    byte[] bytes = params.toString().getBytes();
                    connection.getOutputStream().write(bytes);
                    in = connection.getInputStream();
                    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
                    StringBuilder response = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }
                    Gson gson = new Gson();
                    reMessage = gson.fromJson(response.toString(), ReturnLoginMessage.class);
                    if (reMessage.getStatus() == 200) {
                        myCallBack.toDo();
                        return;
                    } else {
                        message.obj = WRONG_PASSWORD_MESSAGE;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                    message.obj = NETWORK_ERROR_MESSAGE;
                } finally {
                    try {
                        in.close();
                        out.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                handler.sendMessage(message);
            }
        }).start();

    }


}
