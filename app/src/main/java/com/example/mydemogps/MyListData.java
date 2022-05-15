package com.example.mydemogps;

public class MyListData {

    String from_address;
    String to_address;
    String via_location;
    String route_number;

    public MyListData() {
    }

    public MyListData(String from_address, String to_address, String via_location, String route_number) {
        this.from_address = from_address;
        this.to_address = to_address;
        this.via_location = via_location;
        this.route_number = route_number;
    }

    public String getFrom_address() {
        return from_address;
    }

    public void setFrom_address(String from_address) {
        this.from_address = from_address;
    }

    public String getTo_address() {
        return to_address;
    }

    public void setTo_address(String to_address) {
        this.to_address = to_address;
    }

    public String getVia_location() {
        return via_location;
    }

    public void setVia_location(String via_location) {
        this.via_location = via_location;
    }

    public String getRoute_number() {
        return route_number;
    }

    public void setRoute_number(String route_number) {
        this.route_number = route_number;
    }
}
