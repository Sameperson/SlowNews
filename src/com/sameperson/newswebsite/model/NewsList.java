package com.sameperson.newswebsite.model;

import java.util.LinkedList;


public class NewsList {

    private LinkedList<NewsBean> newsList;

    public NewsList() {
        newsList = new LinkedList<>();
    }

    public void addNews(String title, String body) {
        newsList.addFirst(new NewsBean(title, body));
    }

    public LinkedList<NewsBean> getList() {
        return newsList;
    }
}
