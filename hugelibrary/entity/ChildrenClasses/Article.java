package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.AuthorsBook;

public class Article extends AuthorsBook {
    private String language;
    private String yearOfPublication;

    public Article(String language, String yearOfPublication) {
        this.language = language;
        this.yearOfPublication = yearOfPublication;
    }

    public Article(String author, String language, String yearOfPublication) {
        super(author);
        this.language = language;
        this.yearOfPublication = yearOfPublication;
    }

    public Article(String title, String author, String language, String yearOfPublication) {
        super(title, author);
        this.language = language;
        this.yearOfPublication = yearOfPublication;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(String yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Article{" +
                "language='" + language + '\'' +
                ", yearOfPublication='" + yearOfPublication + '\'' +
                "} " + super.toString();
    }
}
