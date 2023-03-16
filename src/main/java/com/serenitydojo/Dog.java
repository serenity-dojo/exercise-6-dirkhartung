package com.serenitydojo;

public class Dog extends Pet {

    private boolean isFed = false;

    public static final String DOG_NOISE = "Woof";

    private String favoriteToy;

    public Dog(String name, String favoriteToy, int age) {
        super(name, age);
        setFavoriteToy(favoriteToy);
    }


    public boolean isFed() {
        return isFed;
    }

    // Exercise 4
    public String makeNoise() {return DOG_NOISE;}

    public void feed() {
        this.isFed = true;
    }

    @Override
    public String play() {
        return "plays with bone";
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public void setFavoriteToy(String favoriteToy) {
        this.favoriteToy = favoriteToy;
    }
}
