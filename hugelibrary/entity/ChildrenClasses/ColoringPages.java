package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.NoAuthorsBook;

public class ColoringPages extends NoAuthorsBook {

    private String kind;
    private String complexity;

    public ColoringPages(String numberOfContentEntities, String kind, String complexity) {
        super(numberOfContentEntities);
        this.kind = kind;
        this.complexity = complexity;
    }

    public ColoringPages(String title, String numberOfContentEntities, String kind, String complexity) {
        super(title, numberOfContentEntities);
        this.kind = kind;
        this.complexity = complexity;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    @Override
    public String toString() {
        return "ColoringPages{" +
                "kind='" + kind + '\'' +
                ", complexity='" + complexity + '\'' +
                "} " + super.toString();
    }
}
