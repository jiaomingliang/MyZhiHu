package com.example.listviewtest;

import java.util.Date;
import java.util.List;

/**
 * Created by rainytunes on 5/2/15.
 */
public class ReturnGettingQuestionListMessage {

    private int status;
    private String info;
    private List<Data> data;

    public int getStatus() {
        return status;
    }

    public String getInfo() {
        return info;
    }

    public List<Data> getData() {
        return data;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public class Data{

        private int id;
        private String title;
        private String content;
        private int authorId;
        private int bestAnsewrId;
        private Date date;

        public int getId() {
            return id;
        }

        public String getContent() {
            return content;
        }

        public Date getDate() {
            return date;
        }

        public int getAuthorId() {
            return authorId;
        }

        public int getBestAnsewrId() {
            return bestAnsewrId;
        }

        public String getTitle() {
            return title;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setAuthorId(int authorId) {
            this.authorId = authorId;
        }

        public void setBestAnsewrId(int bestAnsewrId) {
            this.bestAnsewrId = bestAnsewrId;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
