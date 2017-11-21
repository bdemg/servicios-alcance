package com.uady.jorge_cano.serviciosatualcance.dao;

import java.io.Serializable;

/**
 * Created by jeremiah on 19/11/2017.
 */

public class Professional implements Serializable{
    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String[] services;
    private float rating;
    private float distanceFromUser;

    public Professional() {
    }

    public Professional(String name, String address, String email, String phoneNumber, String[] services, float distanceFromUser, float rating) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.services = services;
        this.distanceFromUser = distanceFromUser;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getServices() {
        return services;
    }

    public void setServices(String[] services) {
        this.services = services;
    }

    public float getDistanceFromUser() {
        return distanceFromUser;
    }

    public void setDistanceFromUser(float distanceFromUser) {
        this.distanceFromUser = distanceFromUser;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
