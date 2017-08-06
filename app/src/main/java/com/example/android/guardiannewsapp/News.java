package com.example.android.guardiannewsapp;

/**
 * Created by CRIZMA-PC&LAPTOP on 01/08/2017.
 */

public class News {

    String title;
    String author;
    String url;
    String date;
    String section;

    public News(String title, String author, String url, String date, String section) {
        this.title = title;
        this.author = author;
        this.url = url;
        this.date = date;
        this.section = section;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }


    public String getUrl() {
        return url;
    }


    public String getDate() {
        return date;
    }


    public String getSection() {
        return section;
    }


    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", url='" + url + '\'' +
                ", date='" + date + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
