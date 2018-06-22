package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.AuthorsBook;

public class Manuscript extends AuthorsBook {

    private String dateOfCreation;
    private String placeOfCreation;
    private String form;
    private String numberOfPages;

    public Manuscript(String dateOfCreation, String placeOfCreation, String form, String numberOfPages) {
        this.dateOfCreation = dateOfCreation;
        this.placeOfCreation = placeOfCreation;
        this.form = form;
        this.numberOfPages = numberOfPages;
    }

    public Manuscript(String author, String dateOfCreation, String placeOfCreation, String form, String numberOfPages) {
        super(author);
        this.dateOfCreation = dateOfCreation;
        this.placeOfCreation = placeOfCreation;
        this.form = form;
        this.numberOfPages = numberOfPages;
    }

    public Manuscript(String title, String author, String dateOfCreation, String placeOfCreation, String form, String numberOfPages) {
        super(title, author);
        this.dateOfCreation = dateOfCreation;
        this.placeOfCreation = placeOfCreation;
        this.form = form;
        this.numberOfPages = numberOfPages;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getPlaceOfCreation() {
        return placeOfCreation;
    }

    public void setPlaceOfCreation(String placeOfCreation) {
        this.placeOfCreation = placeOfCreation;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Manuscript{" +
                "dateOfCreation='" + dateOfCreation + '\'' +
                ", placeOfCreation='" + placeOfCreation + '\'' +
                ", form='" + form + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                "} " + super.toString();
    }
}
