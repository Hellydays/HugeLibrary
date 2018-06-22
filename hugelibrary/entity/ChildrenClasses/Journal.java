package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.Book;
import com.example.ewgen.hugelibrary.entity.BaseClasses.NoAuthorsBook;

public class Journal extends NoAuthorsBook {

    private String periodicity;
    private String subjects;
    private String genre;
    private String format;

    public Journal(String numberOfContentEntities, String periodicity, String subjects, String genre, String format) {
        super(numberOfContentEntities);
        this.periodicity = periodicity;
        this.subjects = subjects;
        this.genre = genre;
        this.format = format;
    }

    public Journal(String title, String numberOfContentEntities, String periodicity, String subjects, String genre, String format) {
        super(title, numberOfContentEntities);
        this.periodicity = periodicity;
        this.subjects = subjects;
        this.genre = genre;
        this.format = format;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "periodicity='" + periodicity + '\'' +
                ", subjects='" + subjects + '\'' +
                ", genre='" + genre + '\'' +
                ", format='" + format + '\'' +
                "} " + super.toString();
    }
}
