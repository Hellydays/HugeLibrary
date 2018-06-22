package com.example.ewgen.hugelibrary.entity.BaseClasses;

public class Ebook extends Book {

    private String format;
    private String size;

    public Ebook(String format, String size) {
        this.format = format;
        this.size = size;
    }

    public Ebook(String title, String format, String size) {
        super(title);
        this.format = format;
        this.size = size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ebook{" +
                "format='" + format + '\'' +
                ", size='" + size + '\'' +
                "} " + super.toString();
    }
}
