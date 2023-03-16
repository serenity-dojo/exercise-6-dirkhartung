package com.serenitydojo;

public class Cat extends Pet {


    private String favoriteToy;


    public Cat(String name, String favoriteToy, int age) {
        super(name, age);
        setFavoriteToy(favoriteToy);
    }

    @Override
    public String play() {
        return "plays with string";
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }
}
