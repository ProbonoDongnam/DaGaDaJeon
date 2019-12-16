package com.example.map_part.data;

public class MarkerItem {
    double lat;
    double lon;
    String Img;
    String name;
    String call;

    public MarkerItem(double lat,double lon,String Img,String name,String call) {
        this.lat = lat;
        this.lon = lon;
        this.Img = Img;
        this.name = name;
        this.call = call;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public String getImg() {
        return Img;
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

    public void setImg(String img) {
        Img = img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCall(String call) {
        this.call = call;
    }
}
