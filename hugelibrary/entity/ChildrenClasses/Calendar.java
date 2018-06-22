package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.Ebook;

public class Calendar extends Ebook {

    String years;
    String language;
    String theme;

    public Calendar(String format, String size, String years, String language, String theme) {
        super(format, size);
        this.years = years;
        this.language = language;
        this.theme = theme;
    }

    public Calendar(String title, String format, String size, String years, String language, String theme) {
        super(title, format, size);
        this.years = years;
        this.language = language;
        this.theme = theme;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "years='" + years + '\'' +
                ", language='" + language + '\'' +
                ", theme='" + theme + '\'' +
                "} " + super.toString();
    }
}
