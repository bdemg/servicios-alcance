package com.uady.jorge_cano.serviciosatualcance.dao;

/**
 * Created by M on 13/11/2017.
 */

public class Professional {

    private String name;
    private String telephone;
    private String address;
    private float rating;

    public Professional() {}

    public Professional(String name, String telephone, String address, float rating) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
