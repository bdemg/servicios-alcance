package com.uady.jorge_cano.serviciosatualcance.model;

/**
 * Created by jorge-cano on 13/11/17.
 */

public class Comment {

    private String name;
    private String comment;
    private float rating;

    public Comment(String name, String comment, float rating) {
        this.name = name;
        this.comment = comment;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }

    public float getRating() {
        return rating;
    }
}
