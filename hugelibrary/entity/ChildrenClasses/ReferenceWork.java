package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.NoAuthorsBook;

public class ReferenceWork extends NoAuthorsBook {

    private String classification;
    private String topic;
    private String language;

    public ReferenceWork(String numberOfContentEntities, String classification, String topic, String language) {
        super(numberOfContentEntities);
        this.classification = classification;
        this.topic = topic;
        this.language = language;
    }

    public ReferenceWork(String title, String numberOfContentEntities, String classification, String topic, String language) {
        super(title, numberOfContentEntities);
        this.classification = classification;
        this.topic = topic;
        this.language = language;
    }

    public ReferenceWork(String classification, String topic, String language) {
        this.classification = classification;
        this.topic = topic;
        this.language = language;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "ReferenceWork{" +
                "classification='" + classification + '\'' +
                ", topic='" + topic + '\'' +
                ", language='" + language + '\'' +
                "} " + super.toString();
    }
}
