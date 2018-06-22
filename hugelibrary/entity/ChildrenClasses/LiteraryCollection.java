package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.Ebook;

public class LiteraryCollection extends Ebook {
    private String publisher;
    private String numberOfPages;
    private String topic;
    private String literaryType;

    public LiteraryCollection(String format, String size, String publisher, String numberOfPages, String topic, String literaryType) {
        super(format, size);
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.topic = topic;
        this.literaryType = literaryType;
    }

    public LiteraryCollection(String title, String format, String size, String publisher, String numberOfPages, String topic, String literaryType) {
        super(title, format, size);
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
        this.topic = topic;
        this.literaryType = literaryType;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getLiteraryType() {
        return literaryType;
    }

    public void setLiteraryType(String literaryType) {
        this.literaryType = literaryType;
    }

    @Override
    public String toString() {
        return "LiteraryCollection{" +
                "publisher='" + publisher + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                ", topic='" + topic + '\'' +
                ", literaryType='" + literaryType + '\'' +
                "} " + super.toString();
    }
}
