package com.example.listviewtest;

/**
 * Created by rainytunes on 4/28/15.
 */
public class Question {

    private int questionId;
    private String title;
    private String add;
    private boolean isSolved;
    private int imageId;

    public Question(String title,String add,String answer,boolean isSolved,int imageId){
        this.title = title;
        this.questionId = questionId;
        this.isSolved = isSolved;
        this.imageId = imageId;
        this.add = add;
    }

    public int getQuestionId() {
        return questionId;
    }

    public int getImageId() {
        return imageId;
    }

    public String getTitle() {
        return title;
    }


    public String getAdd() {
        return add;
    }

    public boolean getSolvedStatus(){
        return isSolved;
    }
}
