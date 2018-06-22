package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.AuthorsBook;

public class Comics extends AuthorsBook {

    private String plot;
    private String universe;
    private String numberOfPages;
    private String superhero;

    public Comics(String plot, String universe, String numberOfPages, String superhero) {
        this.plot = plot;
        this.universe = universe;
        this.numberOfPages = numberOfPages;
        this.superhero = superhero;
    }

    public Comics(String author, String plot, String universe, String numberOfPages, String superhero) {
        super(author);
        this.plot = plot;
        this.universe = universe;
        this.numberOfPages = numberOfPages;
        this.superhero = superhero;
    }

    public Comics(String title, String author, String plot, String universe, String numberOfPages, String superhero) {
        super(title, author);
        this.plot = plot;
        this.universe = universe;
        this.numberOfPages = numberOfPages;
        this.superhero = superhero;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public String getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(String numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getSuperhero() {
        return superhero;
    }

    public void setSuperhero(String superhero) {
        this.superhero = superhero;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "plot='" + plot + '\'' +
                ", universe='" + universe + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                ", superhero='" + superhero + '\'' +
                "} " + super.toString();
    }
}
