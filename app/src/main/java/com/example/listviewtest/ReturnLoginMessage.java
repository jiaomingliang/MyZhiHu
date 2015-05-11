package com.example.listviewtest;

/**
 * Created by rainytunes on 5/2/15.
 */
public class ReturnLoginMessage {

    private int status;
    private String info;
    private String data;

    public void setStatus(int status) {
        this.status = status;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getStatus() {
        return status;
    }

    public String getInfo() {
        return info;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
