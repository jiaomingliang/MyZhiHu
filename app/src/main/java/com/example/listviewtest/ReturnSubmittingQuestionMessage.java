package com.example.listviewtest;

/**
 * Created by rainytunes on 5/2/15.
 */
public class ReturnSubmittingQuestionMessage {

    private int status;
    private String info;
    private String data;

    public String getData() {
        return data;
    }

    public String getInfo() {
        return info;
    }

    public int getStatus() {
        return status;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
