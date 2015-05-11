package com.example.listviewtest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by rainytunes on 4/28/15.
 */
public class SubmittingQuestionFragment extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.submitting_question_fragment,container,false);
        return view;
    }

    @Override
    public void onClick(View v) {

    }


}
