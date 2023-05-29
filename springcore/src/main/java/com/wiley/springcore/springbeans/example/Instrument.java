package com.wiley.springcore.springbeans.example;

public class Instrument {

    private String make;
    private String place;
    private int year;

    private Instrument(String make, String place, int year) {
        this.make = make;
        this.place = place;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getPlace() {
        return place;
    }

    public int getYear() {
        return year;
    }

    // Factory method to create an instance of Car
    public static Instrument createInstance(String make, String place, int year) {
        return new Instrument(make, place, year);
    }
}