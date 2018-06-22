package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.AuthorsBook;
import com.example.ewgen.hugelibrary.entity.BaseClasses.Book;

public class Encyclopedia extends AuthorsBook {

    private String branch;
    private String theTargetAudience;
    private String volume;
    private String numberOfPages;

    public Encyclopedia(String branch, String theTargetAudience, String volume, String numberOfPages) {
        this.branch = branch;
        this.theTargetAudience = theTargetAudience;
        this.volume = volume;
        this.numberOfPages = numberOfPages;
    }

    public Encyclopedia(String author, String branch, String theTargetAudience, String volume, String numberOfPages) {
        super(author);
        this.branch = branch;
        this.theTargetAudience = theTargetAudience;
        this.volume = volume;
        this.numberOfPages = numberOfPages;
    }

    public Encyclopedia(String title, String author, String branch, String theTargetAudience, String volume, String numberOfPages) {
        super(title, author);
        this.branch = branch;
        this.theTargetAudience = theTargetAudience;
        this.volume = volume;
        this.numberOfPages = numberOfPages;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getTheTargetAudience() {
        return theTargetAudience;
    }

    public void setTheTargetAudience(String theTargetAudience) {
        this.theTargetAudience = theTargetAudience;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Encyclopedia{" +
                "branch='" + branch + '\'' +
                ", theTargetAudience='" + theTargetAudience + '\'' +
                ", volume='" + volume + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                "} " + super.toString();
    }
}
