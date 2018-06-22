package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.AuthorsBook;

public class Album extends AuthorsBook {

    private String subject;
    private String numberOfPictures;

    public Album(String subject, String numberOfPictures) {
        this.subject = subject;
        this.numberOfPictures = numberOfPictures;
    }

    public Album(String author, String subject, String numberOfPictures) {
        super(author);
        this.subject = subject;
        this.numberOfPictures = numberOfPictures;
    }

    public Album(String title, String author, String subject, String numberOfPictures) {
        super(title, author);
        this.subject = subject;
        this.numberOfPictures = numberOfPictures;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNumberOfPictures() {
        return numberOfPictures;
    }

    public void setNumberOfPictures(String numberOfPictures) {
        this.numberOfPictures = numberOfPictures;
    }

    @Override
    public String toString() {
        return "Album{" +
                "subject='" + subject + '\'' +
                ", numberOfPictures='" + numberOfPictures + '\'' +
                "} " + super.toString();
    }
}
