package com.uady.jorge_cano.serviciosatualcance.dao;

import java.util.ArrayList;

/**
 * Created by M on 13/11/2017.
 */

public class Professional {

    private String name;
    private String telephone;
    private String address;
    private float rating;
    private ArrayList<String> professions;

    public Professional() {}

    public Professional(String name, String telephone, String address, float rating, ArrayList<String> professions) {
        this.name = name;
        this.telephone = telephone;
        this.address = address;
        this.rating = rating;
        this.professions = professions;
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

    public ArrayList<String> getProfessions() {
        return professions;
    }

    public void setProfessions(ArrayList<String> professions) {
        this.professions = professions;
    }

    public void setProfession(String profession){
        this.professions.add(profession);
    }
}
