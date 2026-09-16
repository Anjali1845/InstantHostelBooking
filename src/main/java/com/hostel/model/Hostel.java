package com.hostel.model;

public class Hostel {

    private int id;
    private String name;
    private String location;
    private int totalBeds;
    private int availableBeds;

    public Hostel() {}

    public Hostel(int id, String name, String location, int totalBeds, int availableBeds) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.totalBeds = totalBeds;
        this.availableBeds = availableBeds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalBeds() {
        return totalBeds;
    }

    public void setTotalBeds(int totalBeds) {
        this.totalBeds = totalBeds;
    }

    public int getAvailableBeds() {
        return availableBeds;
    }

    public void setAvailableBeds(int availableBeds) {
        this.availableBeds = availableBeds;
    }
}