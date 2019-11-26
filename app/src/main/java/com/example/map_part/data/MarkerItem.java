package com.example.map_part.data;

public class MarkerItem {
    double lat;
    double lon;
    String name;
    String call;

    public MarkerItem(double lat,double lon,String name,String call) {
        this.lat = lat;
        this.lon = lon;
        this.name = name;
        this.call = call;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getName() {
        return name;
    }

    public String getCall() {
        return call;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCall(String call) {
        this.call = call;
    }
}
