package com.example.listviewtest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by rainytunes on 4/28/15.
 */
public class QuestionDetailFragment extends Fragment {

    private View view;
    private TextView questionDetailTitleText,questionDetailAddText,questionDetailAnswerText;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.question_detail_fragment,container,false);
        return view;
    }


    public void refresh(String questionTitle,String questionAdd,String questionAnswer){
//        View visibilityLayout = view.findViewById(R.id.visibility_layout);
//        visibilityLayout.setVisibility(View.VISIBLE);
        questionDetailAddText = (TextView) view.findViewById(R.id.question_detail_add);
//        questionDetailAnswerText = (TextView) view.findViewById(R.id.question_detail_answer);

        questionDetailAddText.setText(questionAdd);
        questionDetailAnswerText.setText(questionAnswer);

    }
}