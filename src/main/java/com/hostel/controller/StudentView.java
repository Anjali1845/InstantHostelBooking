package com.hostel.controller;

import java.util.List;

import com.hostel.dao.StudentDAO;
import com.hostel.model.Student;

public class StudentView {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        List<Student> students = dao.getAllStudents();

        System.out.println("\n========= STUDENT LIST =========\n");

        for (Student s : students) {

            System.out.println("ID      : " + s.getId());
            System.out.println("Name    : " + s.getName());
            System.out.println("Email   : " + s.getEmail());
            System.out.println("Phone   : " + s.getPhone());
            System.out.println("Course  : " + s.getCourse());
            System.out.println("Room No : " + s.getRoomNo());

            System.out.println("------------------------------");
        }
    }
}