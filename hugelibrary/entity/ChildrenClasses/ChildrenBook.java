package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.AuthorsBook;
import com.example.ewgen.hugelibrary.entity.BaseClasses.Book;

public class ChildrenBook extends AuthorsBook {

    private String plot;
    private String genre;
    private String publishingHouse;
    private String numberOfPages;

    public ChildrenBook() {

    }

    public ChildrenBook(String plot, String genre, String publishingHouse, String numberOfPages) {
        this.plot = plot;
        this.genre = genre;
        this.publishingHouse = publishingHouse;
        this.numberOfPages = numberOfPages;
    }

    public ChildrenBook(String author, String plot, String genre, String publishingHouse, String numberOfPages) {
        super(author);
        this.plot = plot;
        this.genre = genre;
        this.publishingHouse = publishingHouse;
        this.numberOfPages = numberOfPages;
    }

    public ChildrenBook(String title, String author, String plot, String genre, String publishingHouse, String numberOfPages) {
        super(title, author);
        this.plot = plot;
        this.genre = genre;
        this.publishingHouse = publishingHouse;
        this.numberOfPages = numberOfPages;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "ChildrenBook{" +
                "plot='" + plot + '\'' +
                ", genre='" + genre + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                "} " + super.toString();
    }
}
