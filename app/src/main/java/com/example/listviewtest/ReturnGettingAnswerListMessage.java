package com.example.listviewtest;

import java.util.Date;
import java.util.List;

/**
 * Created by rainytunes on 5/2/15.
 */
public class ReturnGettingAnswerListMessage {

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

        private int questionId;
        private int id;
        private String content;
        private int authorId;
        private Date date;

        public int getId() {
            return id;
        }

        public int getQuestionId() {
            return questionId;
        }

        public int getAuthorId() {
            return authorId;
        }

        public Date getDate() {
            return date;
        }

        public String getContent() {
            return content;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public void setAuthorId(int authorId) {
            this.authorId = authorId;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setQuestionId(int questionId) {
            this.questionId = questionId;
        }
    }
}
