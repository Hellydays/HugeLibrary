package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.NoAuthorsBook;

public class TaxReturn extends NoAuthorsBook {

    private String country;
    private String nameOfTheTaxpayer;
    private String typeOfTaxReturn;
    private String yearOfDeclaration;

    public TaxReturn(String numberOfContentEntities, String country, String nameOfTheTaxpayer, String typeOfTaxReturn, String yearOfDeclaration) {
        super(numberOfContentEntities);
        this.country = country;
        this.nameOfTheTaxpayer = nameOfTheTaxpayer;
        this.typeOfTaxReturn = typeOfTaxReturn;
        this.yearOfDeclaration = yearOfDeclaration;
    }

    public TaxReturn(String title, String numberOfContentEntities, String country, String nameOfTheTaxpayer, String typeOfTaxReturn, String yearOfDeclaration) {
        super(title, numberOfContentEntities);
        this.country = country;
        this.nameOfTheTaxpayer = nameOfTheTaxpayer;
        this.typeOfTaxReturn = typeOfTaxReturn;
        this.yearOfDeclaration = yearOfDeclaration;
    }

    public TaxReturn(String country, String nameOfTheTaxpayer, String typeOfTaxReturn, String yearOfDeclaration) {
        this.country = country;
        this.nameOfTheTaxpayer = nameOfTheTaxpayer;
        this.typeOfTaxReturn = typeOfTaxReturn;
        this.yearOfDeclaration = yearOfDeclaration;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getNameOfTheTaxpayer() {
        return nameOfTheTaxpayer;
    }

    public void setNameOfTheTaxpayer(String nameOfTheTaxpayer) {
        this.nameOfTheTaxpayer = nameOfTheTaxpayer;
    }

    public String getTypeOfTaxReturn() {
        return typeOfTaxReturn;
    }

    public void setTypeOfTaxReturn(String typeOfTaxReturn) {
        this.typeOfTaxReturn = typeOfTaxReturn;
    }

    public String getYearOfDeclaration() {
        return yearOfDeclaration;
    }

    public void setYearOfDeclaration(String yearOfDeclaration) {
        this.yearOfDeclaration = yearOfDeclaration;
    }

    @Override
    public String toString() {
        return "TaxReturn{" +
                "country='" + country + '\'' +
                ", nameOfTheTaxpayer='" + nameOfTheTaxpayer + '\'' +
                ", typeOfTaxReturn='" + typeOfTaxReturn + '\'' +
                ", yearOfDeclaration='" + yearOfDeclaration + '\'' +
                '}';
    }
}
