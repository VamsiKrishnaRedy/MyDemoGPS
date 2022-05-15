package com.example.mydemogps;

public class Adder {

    double Lat;
    double Long;

    public Adder() {
    }

    public Adder(double lat, double aLong) {
        Lat = lat;
        Long = aLong;
    }

    public double getLat() {
        return Lat;
    }

    public void setLat(double lat) {
        Lat = lat;
    }

    public double getLong() {
        return Long;
    }

    public void setLong(double aLong) {
        Long = aLong;
    }
}
