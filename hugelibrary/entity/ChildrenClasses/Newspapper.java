package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.Book;

public class Newspapper extends Book {
    private String editor;
    private String periodicity;
    private String paidOrfree;

    public Newspapper(String editor, String periodicity, String paidOrfree) {
        this.editor = editor;
        this.periodicity = periodicity;
        this.paidOrfree = paidOrfree;
    }

    public Newspapper(String title, String editor, String periodicity, String paidOrfree) {
        super(title);
        this.editor = editor;
        this.periodicity = periodicity;
        this.paidOrfree = paidOrfree;
    }

    public Newspapper() {
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public String getPaidOrfree() {
        return paidOrfree;
    }

    public void setPaidOrfree(String paidOrfree) {
        this.paidOrfree = paidOrfree;
    }

    @Override
    public String toString() {
        return "Newspapper{" +
                "editor='" + editor + '\'' +
                ", periodicity='" + periodicity + '\'' +
                ", paidOrfree='" + paidOrfree + '\'' +
                "} " + super.toString();
    }
}
