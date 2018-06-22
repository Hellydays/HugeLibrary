package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.AuthorsBook;

public class Reproduction extends AuthorsBook {

    private String printingMethod;
    private String numberOfColors;
    private String material;
    private String size;

    public Reproduction(String printingMethod, String numberOfColors, String material, String size) {
        this.printingMethod = printingMethod;
        this.numberOfColors = numberOfColors;
        this.material = material;
        this.size = size;
    }

    public Reproduction(String author, String printingMethod, String numberOfColors, String material, String size) {
        super(author);
        this.printingMethod = printingMethod;
        this.numberOfColors = numberOfColors;
        this.material = material;
        this.size = size;
    }

    public Reproduction(String title, String author, String printingMethod, String numberOfColors, String material, String size) {
        super(title, author);
        this.printingMethod = printingMethod;
        this.numberOfColors = numberOfColors;
        this.material = material;
        this.size = size;
    }

    public String getPrintingMethod() {
        return printingMethod;
    }

    public void setPrintingMethod(String printingMethod) {
        this.printingMethod = printingMethod;
    }

    public String getNumberOfColors() {
        return numberOfColors;
    }

    public void setNumberOfColors(String numberOfColors) {
        this.numberOfColors = numberOfColors;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Reproduction{" +
                "printingMethod='" + printingMethod + '\'' +
                ", numberOfColors='" + numberOfColors + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                "} " + super.toString();
    }
}
