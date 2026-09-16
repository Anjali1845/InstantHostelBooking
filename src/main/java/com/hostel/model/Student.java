package com.hostel.model;

public class Student {

    private int id;
    private String name;
    private String email;
    private String phone;
    private String course;
    private String roomNo;

    public Student() {
    }

    public Student(int id, String name, String email,
                   String phone, String course, String roomNo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.course = course;
        this.roomNo = roomNo;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCourse() {
        return course;
    }

    public String getRoomNo() {
        return roomNo;
    }

    // Setters

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setRoomNo(String roomNo) {
        this.roomNo = roomNo;
    }
}