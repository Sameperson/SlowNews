package com.sameperson.newswebsite.model;

import java.time.LocalDateTime;

public class NewsBean {


    private String title;
    private String body;
    private LocalDateTime timeOfPublication;

    public NewsBean() {
        this.refreshTime();
    }

    public NewsBean(String title, String newsBody) {
        this.refreshTime();
        this.title = title;
        this.body = newsBody;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setNewsBody(String newsBody) {
        this.body = newsBody;
    }

    public void setCurrentTime() {
        this.refreshTime();
    }

    public String getTimeOnly() {
        return timeOfPublication.getHour() + " : " + timeOfPublication.getMinute();
    }

    private void refreshTime() {
        this.timeOfPublication = LocalDateTime.now();
    }


}
