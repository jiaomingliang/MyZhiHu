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
public class AnswerAdapter extends ArrayAdapter<Answer> {

    private int resourceId;


    public AnswerAdapter(Context context, int textViewResourceId,List<Answer> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Answer theAnswer = getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(resourceId, null);

        ImageView answererProfile = (ImageView) view.findViewById(R.id.answerer_profile);
        TextView answererNickname = (TextView) view.findViewById(R.id.answerer_nickname);
        TextView answererSignature = (TextView) view.findViewById(R.id.answerer_signature);
        TextView answerContent = (TextView) view.findViewById(R.id.answer_content);

        answererProfile.setImageResource(theAnswer.getUserProfileImageId());
        answererNickname.setText(theAnswer.getAnswererNickname());
        answerContent.setText(theAnswer.getAnswerContent());
        answererSignature.setText(theAnswer.getAnswererSignature());

        return view;
    }
}
