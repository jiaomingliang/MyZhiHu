package com.example.listviewtest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by rainytunes on 4/30/15.
 */
public class SubmittingQuestionActivity extends Activity {

    public static void actionStart(Context context,String user_token){
        Intent intent = new Intent(context,SubmittingQuestionActivity.class);
        intent.putExtra("user_token",user_token);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.submitting_question_content);
        TextView actionBarTitle = (TextView) findViewById(R.id.action_bar_title);
        actionBarTitle.setText("提交问题");
    }
}
