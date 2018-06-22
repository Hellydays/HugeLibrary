package com.example.ewgen.hugelibrary.entity.ChildrenClasses;

import com.example.ewgen.hugelibrary.entity.BaseClasses.Book;
import com.example.ewgen.hugelibrary.entity.BaseClasses.NoAuthorsBook;

public class Cookbook extends NoAuthorsBook {

    String type;
    String ingredients;

    public Cookbook(String numberOfContentEntities, String type, String ingredients) {
        super(numberOfContentEntities);
        this.type = type;
        this.ingredients = ingredients;
    }

    public Cookbook(String title, String numberOfContentEntities, String type, String ingredients) {
        super(title, numberOfContentEntities);
        this.type = type;
        this.ingredients = ingredients;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Cookbook{" +
                "type='" + type + '\'' +
                ", ingredients='" + ingredients + '\'' +
                "} " + super.toString();
    }
}
