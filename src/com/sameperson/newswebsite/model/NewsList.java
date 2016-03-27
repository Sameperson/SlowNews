package com.sameperson.newswebsite.model;

import java.util.ArrayList;
import java.util.LinkedList;


public class NewsList {

    private ArrayList<NewsBean> newsList;

    public NewsList() {
        newsList = new ArrayList<>();
        this.addNews("01-something-happened", "Something happened! Something that deserves to tell in the news!", "Text of the news");
        this.addNews("01-something-also-happened", "Something else happened!" , "Text of the news 2");
    }

    public synchronized void addNews(String name, String title, String body) {
        newsList.add(0, new NewsBean(name, title, body));
    }

    public ArrayList<NewsBean> getList() {
        return newsList;
    }

    public NewsBean findByName(String name) {
        for(NewsBean newsBean : newsList) {
            if(newsBean.getName().equals(name)) {
                return newsBean;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String titles = "";
        for(NewsBean newsBean : newsList) {
            titles += newsBean.getTitle() + " | ";
        }
        return titles;
    }

}
