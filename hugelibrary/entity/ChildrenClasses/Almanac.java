package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.NoAuthorsBook;

public class Almanac extends NoAuthorsBook {
    private String theme;

    public Almanac(String numberOfContentEntities, String theme) {
        super(numberOfContentEntities);
        this.theme = theme;
    }

    public Almanac(String title, String numberOfContentEntities, String theme) {
        super(title, numberOfContentEntities);
        this.theme = theme;
    }

    public Almanac(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Almanac{" +
                "theme='" + theme + '\'' +
                "} " + super.toString();
    }
}
