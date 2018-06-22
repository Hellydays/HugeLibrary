package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

public class Broshure extends Journal {

    private String circulation;

    public Broshure(String numberOfContentEntities, String periodicity, String subjects, String genre, String format, String circulation) {
        super(numberOfContentEntities, periodicity, subjects, genre, format);
        this.circulation = circulation;
    }

    public Broshure(String title, String numberOfContentEntities, String periodicity, String subjects, String genre, String format, String circulation) {
        super(title, numberOfContentEntities, periodicity, subjects, genre, format);
        this.circulation = circulation;
    }

    public String getCirculation() {
        return circulation;
    }

    public void setCirculation(String circulation) {
        this.circulation = circulation;
    }

    @Override
    public String toString() {
        return "Broshure{" +
                "circulation='" + circulation + '\'' +
                "} " + super.toString();
    }
}
