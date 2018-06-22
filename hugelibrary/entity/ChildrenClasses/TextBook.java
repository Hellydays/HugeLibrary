package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.AuthorsBook;
import com.example.ewgen.hugelibrary.entity.BaseClasses.Ebook;

public class TextBook extends AuthorsBook {

   private String subject;
   private int numberOfPages;

    public TextBook(String subject, int numberOfPages) {
        this.subject = subject;
        this.numberOfPages = numberOfPages;
    }

    public TextBook(String author, String subject, int numberOfPages) {
        super(author);
        this.subject = subject;
        this.numberOfPages = numberOfPages;
    }

    public TextBook(String title, String author, String subject, int numberOfPages) {
        super(title, author);
        this.subject = subject;
        this.numberOfPages = numberOfPages;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "TextBook{" +
                "subject='" + subject + '\'' +
                ", numberOfPages=" + numberOfPages +
                "} " + super.toString();
    }
}
