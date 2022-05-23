package com.example.my;

public class Pizza {
    private String name;
    private int imageResourceId;
    public static final Pizza[] pizzas = {
            new Pizza("Diavolo", R.drawable.carousel2),
            new Pizza("Funghi", R.drawable.carousel1),
            new Pizza("Funghi", R.drawable.carousel3),
            new Pizza("Funghi", R.drawable.carousel4)
    };
    private Pizza(String name, int imageResourceId) {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public int getImageResourceId() {
        return imageResourceId;
    }
}
