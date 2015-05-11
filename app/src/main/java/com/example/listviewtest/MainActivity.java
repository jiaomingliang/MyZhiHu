package com.example.listviewtest;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private String account, password, token;
    private ImageView submittingQuestionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        account = getIntent().getStringExtra("account");
        password = getIntent().getStringExtra("password");
        token  = getIntent().getStringExtra("token");

        submittingQuestionButton = (ImageView) findViewById(R.id.submitting_quesiton_button);
    }

    public static void actionStart(Context context,String account,String password,String token){
        Intent intent = new Intent(context,MainActivity.class);
        intent.putExtra("account",account);
        intent.putExtra("password",password);
        intent.putExtra("token",token);
        context.startActivity(intent);
    }

    public String getToken(){
        return token;
    }

}
