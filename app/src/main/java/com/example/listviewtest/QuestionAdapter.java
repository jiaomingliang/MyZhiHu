package com.example.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by rainytunes on 4/28/15.
 */
public class QuestionAdapter extends ArrayAdapter<Question> {

    private int resourceId;


    public QuestionAdapter(Context context, int textViewResourceId,List<Question> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Question theQuestion = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);

        ImageView userProfile = (ImageView) view.findViewById(R.id.user_profile);
        TextView questionTitle = (TextView) view.findViewById(R.id.question_title);
        TextView questionStatus = (TextView) view.findViewById(R.id.question_status);

        userProfile.setImageResource(theQuestion.getImageId());
        questionTitle.setText(theQuestion.getTitle());

        if(theQuestion.getSolvedStatus())
        {
            questionStatus.setText("已解决");
        }else{
            questionStatus.setText("未解决");
        }
        return view;

    }
}
