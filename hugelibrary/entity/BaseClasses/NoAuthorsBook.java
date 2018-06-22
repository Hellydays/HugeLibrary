package com.example.ewgen.hugelibrary.entity.BaseClasses;

public class NoAuthorsBook extends Book {

    private String numberOfContentEntities;

    public NoAuthorsBook(String numberOfContentEntities) {
        this.numberOfContentEntities = numberOfContentEntities;
    }

    public NoAuthorsBook(String title, String numberOfContentEntities) {
        super(title);
        this.numberOfContentEntities = numberOfContentEntities;
    }

    public NoAuthorsBook() {
    }

    public String getNumberOfContentEntities() {
        return numberOfContentEntities;
    }

    public void setNumberOfContentEntities(String numberOfContentEntities) {
        this.numberOfContentEntities = numberOfContentEntities;
    }

    @Override
    public String toString() {
        return "NoAuthorsBook{" +
                "numberOfContentEntities='" + numberOfContentEntities + '\'' +
                "} " + super.toString();
    }
}
