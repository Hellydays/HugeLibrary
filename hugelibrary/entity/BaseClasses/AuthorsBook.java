package com.example.ewgen.hugelibrary.entity.BaseClasses;

public class AuthorsBook extends Book {

    private String author;

    public AuthorsBook() {

    }

    public AuthorsBook(String author) {
        this.author = author;
    }

    public AuthorsBook(String title, String author) {
        super(title);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "AuthorsBook{" +
                "author='" + author + '\'' +
                "} " + super.toString();
    }
}
