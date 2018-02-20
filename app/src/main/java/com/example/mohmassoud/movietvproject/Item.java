package com.example.mohmassoud.movietvproject;

/**
 * Created by Moh.Massoud on 2/6/2018.
 */

public class Item {
    private String name;
    private String description;
    private int imageID;
    private int itemRating;

    public Item(String name, String description, int imageID, int itemRating) {
        this.name = name;
        this.description = description;
        this.imageID = imageID;
        this.itemRating = itemRating;
    }

    public int getItemRating() {
        return itemRating;
    }
    public String getName() {

        return name;
    }

    public String getDescription() {

        return description;
    }

    public int getImageID() {

        return imageID;
    }
}
