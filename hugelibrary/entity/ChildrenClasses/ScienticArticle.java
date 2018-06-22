package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import android.net.http.SslCertificate;

import com.example.ewgen.hugelibrary.entity.BaseClasses.AuthorsBook;

public class ScienticArticle extends AuthorsBook {

    private String topic;
    private String scientificSphere;

    public ScienticArticle(String topic, String scientificSphere) {
        this.topic = topic;
        this.scientificSphere = scientificSphere;
    }

    public ScienticArticle(String author, String topic, String scientificSphere) {
        super(author);
        this.topic = topic;
        this.scientificSphere = scientificSphere;
    }

    public ScienticArticle(String title, String author, String topic, String scientificSphere) {
        super(title, author);
        this.topic = topic;
        this.scientificSphere = scientificSphere;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getScientificSphere() {
        return scientificSphere;
    }

    public void setScientificSphere(String scientificSphere) {
        this.scientificSphere = scientificSphere;
    }

    @Override
    public String toString() {
        return "ScienticArticle{" +
                "topic='" + topic + '\'' +
                ", scientificSphere='" + scientificSphere + '\'' +
                "} " + super.toString();
    }
}
