package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.AuthorsBook;
import com.example.ewgen.hugelibrary.entity.BaseClasses.Book;

public class MiniatureEditionBook extends AuthorsBook {

    private String size;
    private String topic;
    private String numberOfPages;

    public MiniatureEditionBook(String size, String topic, String numberOfPages) {
        this.size = size;
        this.topic = topic;
        this.numberOfPages = numberOfPages;
    }

    public MiniatureEditionBook(String author, String size, String topic, String numberOfPages) {
        super(author);
        this.size = size;
        this.topic = topic;
        this.numberOfPages = numberOfPages;
    }

    public MiniatureEditionBook(String title, String author, String size, String topic, String numberOfPages) {
        super(title, author);
        this.size = size;
        this.topic = topic;
        this.numberOfPages = numberOfPages;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "MiniatureEditionBook{" +
                "size='" + size + '\'' +
                ", topic='" + topic + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                "} " + super.toString();
    }
}
