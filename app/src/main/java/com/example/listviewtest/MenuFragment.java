package com.example.listviewtest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rainytunes on 4/28/15.
 */
public class MenuFragment extends Fragment implements AdapterView.OnItemClickListener ,View.OnClickListener{

    private ListView listView;
    private View view;

    private List<Question> questionList = new ArrayList<>();
    private QuestionAdapter adapter;

    private ImageView submitting_question_button,action_bar_left_icon;
    private Animation submitting_question_button_anim;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.menu_fragment, container, false);
        initQuestions();
        initResource();
        return view;
    }

    public void initResource() {
        adapter = new QuestionAdapter(getActivity(), R.layout.qustion_item, questionList);
        listView = (ListView) view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        submitting_question_button = (ImageView) view.findViewById(R.id.submitting_quesiton_button);
        submitting_question_button_anim = AnimationUtils.loadAnimation(getActivity(), R.anim.submitting_question_button_anim);
        submitting_question_button_anim.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                MainActivity mainActivity  = (MainActivity) getActivity();
                SubmittingQuestionActivity.actionStart(getActivity(), mainActivity.getToken());
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


        submitting_question_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitting_question_button.startAnimation(submitting_question_button_anim);
            }
        });
    }

    public void initQuestions() {
        Question q0 = new Question("学挖掘机到底哪家强", "如题", "谢邀。作为一个学挖掘机的女孩，人们见了我总是不禁要问：学挖掘机，到底哪家强？而我只祈求，让人类定义的答案都随风而逝，因为每一台挖掘机的心里，都有一所蓝翔", true, R.drawable.profile);
        Question q1 = new Question("测试问题的标题", "测试问题的补充", "测试问题的回答", false, R.drawable.profile);
        Question q2 = new Question("测试问题的标题", "测试问题的补充", "测试问题的回答", false, R.drawable.profile);
        Question q3 = new Question("测试问题的标题", "测试问题的补充", "测试问题的回答", false, R.drawable.profile);
        Question q4 = new Question("测试问题的标题", "测试问题的补充", "测试问题的回答", false, R.drawable.profile);
        Question q5 = new Question("测试问题的标题", "测试问题的补充", "测试问题的回答", false, R.drawable.profile);
        Question q6 = new Question("测试问题的标题", "测试问题的补充", "测试问题的回答", false, R.drawable.profile);
        Question q7 = new Question("测试问题的标题", "测试问题的补充", "测试问题的回答", false, R.drawable.profile);
        Question q8 = new Question("测试问题的标题", "测试问题的补充", "测试问题的回答", false, R.drawable.profile);
        Question q9 = new Question("测试问题的标题", "测试问题的补充", "测试问题的回答", false, R.drawable.profile);
        Question q10 = new Question("测试问题的标题", "测试问题的补充", "测试问题的回答", false, R.drawable.profile);
        Question q11 = new Question("测试问题的标题", "测试问题的补充", "测试问题的回答", false, R.drawable.profile);
        Question q12 = new Question("测试问题的标题", "测试问题的补充", "测试问题的回答", false, R.drawable.profile);
        Question q13 = new Question("测试问题的标题", "测试问题的补充", "测试问题的回答", false, R.drawable.profile);

        questionList.add(q0);
        questionList.add(q1);
        questionList.add(q2);
        questionList.add(q3);
        questionList.add(q4);
        questionList.add(q5);
        questionList.add(q6);
        questionList.add(q7);
        questionList.add(q8);
        questionList.add(q9);
        questionList.add(q10);
        questionList.add(q11);
        questionList.add(q12);
        questionList.add(q13);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Question question = questionList.get(position);
        //平板界面
        //手机界面
        QuestionDetailActivity.actionStart(getActivity(), question.getQuestionId());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (submitting_question_button != null) submitting_question_button.clearAnimation();
    }
}
