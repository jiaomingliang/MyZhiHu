package com.example.listviewtest;

/**
 * Created by rainytunes on 5/2/15.
 */
public class ReturningAnswerQuestionMessage {

    private int questionId;
    private String content;
    private String token;

    public void setContent(String content) {
        this.content = content;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getContent() {
        return content;
    }

    public String getToken() {
        return token;
    }
}
