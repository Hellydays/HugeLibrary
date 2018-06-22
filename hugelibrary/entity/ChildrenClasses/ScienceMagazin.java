package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.NoAuthorsBook;

public class ScienceMagazin extends NoAuthorsBook {

   private String issueNumber;
   private String topic;
   private String publishingHouse;

    public ScienceMagazin(String numberOfContentEntities, String issueNumber, String topic, String publishingHouse) {
        super(numberOfContentEntities);
        this.issueNumber = issueNumber;
        this.topic = topic;
        this.publishingHouse = publishingHouse;
    }

    public ScienceMagazin(String title, String numberOfContentEntities, String issueNumber, String topic, String publishingHouse) {
        super(title, numberOfContentEntities);
        this.issueNumber = issueNumber;
        this.topic = topic;
        this.publishingHouse = publishingHouse;
    }

    public ScienceMagazin() {
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    @Override
    public String toString() {
        return "ScienceMagazin{" +
                "issueNumber='" + issueNumber + '\'' +
                ", topic='" + topic + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                "} " + super.toString();
    }
}
