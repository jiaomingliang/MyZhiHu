package com.example.listviewtest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by rainytunes on 4/30/15.
 */
public class QuestionDetailActivity extends Activity{

    private String questionTitle, questionAdd, questionAnswer;
    private int questionId;


    public static void actionStart(Context context,int questionId){
        Intent intent = new Intent(context,QuestionDetailActivity.class);
        //学习序列化，然后传递两个对象：问题、人
        intent.putExtra("question_id",questionId+"");
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_detail_content);

        questionId = Integer.parseInt(getIntent().getStringExtra("question_id"));
        TextView actionBarTitle = (TextView) findViewById(R.id.action_bar_title);

        //仅为测试使用
        //actionBarTitle.setText(questionTitle);
        //QuestionDetailFragment questionDetailFragment = (QuestionDetailFragment) getFragmentManager().findFragmentById(R.id.question_detail_fragment);
        //questionDetailFragm/ent.refresh(questionTitle,questionAdd,questionAnswer);

    }
}
