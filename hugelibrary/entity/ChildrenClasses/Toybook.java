package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.NoAuthorsBook;

public class Toybook extends NoAuthorsBook {

    private String publishingHouse;
    private String bookCover;
    private String composition;

    public Toybook(String numberOfContentEntities, String publishingHouse, String bookCover, String composition) {
        super(numberOfContentEntities);
        this.publishingHouse = publishingHouse;
        this.bookCover = bookCover;
        this.composition = composition;
    }

    public Toybook(String title, String numberOfContentEntities, String publishingHouse, String bookCover, String composition) {
        super(title, numberOfContentEntities);
        this.publishingHouse = publishingHouse;
        this.bookCover = bookCover;
        this.composition = composition;
    }

    public Toybook(String publishingHouse, String bookCover, String composition) {
        this.publishingHouse = publishingHouse;
        this.bookCover = bookCover;
        this.composition = composition;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getBookCover() {
        return bookCover;
    }

    public void setBookCover(String bookCover) {
        this.bookCover = bookCover;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    @Override
    public String toString() {
        return "Toybook{" +
                "publishingHouse='" + publishingHouse + '\'' +
                ", bookCover='" + bookCover + '\'' +
                ", composition='" + composition + '\'' +
                "} " + super.toString();
    }
}
