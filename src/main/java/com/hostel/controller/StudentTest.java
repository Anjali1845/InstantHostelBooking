package com.hostel.controller;

import com.hostel.dao.StudentDAO;
import com.hostel.model.Student;

public class StudentTest {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Anjali");
        s.setEmail("anjali@gmail.com");
        s.setPhone("9876543210");
        s.setCourse("CSE AIML");
        s.setRoomNo("A101");

        StudentDAO dao = new StudentDAO();

        if (dao.addStudent(s)) {
            System.out.println("Student Added Successfully!");
        } else {
            System.out.println("Failed!");
        }
    }
}