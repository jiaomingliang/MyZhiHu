package com.example.listviewtest;

/**
 * Created by rainytunes on 5/1/15.
 */
public class Answer {

    private int answererProfileImageId;
    private String answererNickname;
    private String answererSignature;
    private String answerContent;

    public String getAnswerContent() {
        return answerContent;
    }

    public String getAnswererNickname() {
        return answererNickname;
    }

    public String getAnswererSignature() {
        return answererSignature;
    }

    public int getUserProfileImageId() {
        return answererProfileImageId;
    }
}
