package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.NoAuthorsBook;

public class Yearbook extends NoAuthorsBook {
    private String yearOfIssue;
    private String topic;
    private String format;

    public Yearbook(String numberOfContentEntities, String yearOfIssue, String topic, String format) {
        super(numberOfContentEntities);
        this.yearOfIssue = yearOfIssue;
        this.topic = topic;
        this.format = format;
    }

    public Yearbook(String title, String numberOfContentEntities, String yearOfIssue, String topic, String format) {
        super(title, numberOfContentEntities);
        this.yearOfIssue = yearOfIssue;
        this.topic = topic;
        this.format = format;
    }

    public Yearbook(String yearOfIssue, String topic, String format) {
        this.yearOfIssue = yearOfIssue;
        this.topic = topic;
        this.format = format;
    }

    public String getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(String yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Yearbook{" +
                "yearOfIssue='" + yearOfIssue + '\'' +
                ", topic='" + topic + '\'' +
                ", format='" + format + '\'' +
                "} " + super.toString();
    }
}
