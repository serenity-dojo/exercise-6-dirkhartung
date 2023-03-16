package com.serenitydojo;

public class Hamster extends Pet {

    private String favoriteGame;

    public Hamster(String name, String favoritGame, int age) {
        super(name, age);
        this.favoriteGame = favoritGame;
    }

    @Override
    public String play() {
        return "runs in wheel";
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }
}
