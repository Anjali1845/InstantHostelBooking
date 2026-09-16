package com.hostel.controller;

import java.util.Scanner;

import com.hostel.dao.StudentDAO;
import com.hostel.model.Student;

public class StudentManage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n====== HOSTEL MANAGEMENT ======");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

            case 1:

                Student s = new Student();

                System.out.print("Name: ");
                s.setName(sc.nextLine());

                System.out.print("Email: ");
                s.setEmail(sc.nextLine());

                System.out.print("Phone: ");
                s.setPhone(sc.nextLine());

                System.out.print("Course: ");
                s.setCourse(sc.nextLine());

                System.out.print("Room No: ");
                s.setRoomNo(sc.nextLine());

                if (dao.addStudent(s))
                    System.out.println("Student Added!");
                else
                    System.out.println("Failed!");

                break;

            case 2:

                for (Student st : dao.getAllStudents()) {

                    System.out.println("--------------------------------");
                    System.out.println("ID : " + st.getId());
                    System.out.println("Name : " + st.getName());
                    System.out.println("Email : " + st.getEmail());
                    System.out.println("Phone : " + st.getPhone());
                    System.out.println("Course : " + st.getCourse());
                    System.out.println("Room : " + st.getRoomNo());

                }

                break;

            case 3:

                Student u = new Student();

                System.out.print("Enter Student ID: ");
                u.setId(sc.nextInt());
                sc.nextLine();

                System.out.print("New Name: ");
                u.setName(sc.nextLine());

                System.out.print("New Email: ");
                u.setEmail(sc.nextLine());

                System.out.print("New Phone: ");
                u.setPhone(sc.nextLine());

                System.out.print("New Course: ");
                u.setCourse(sc.nextLine());

                System.out.print("New Room: ");
                u.setRoomNo(sc.nextLine());

                if (dao.updateStudent(u))
                    System.out.println("Updated Successfully!");
                else
                    System.out.println("Update Failed!");

                break;

            case 4:

                System.out.print("Enter ID to Delete: ");
                int id = sc.nextInt();

                if (dao.deleteStudent(id))
                    System.out.println("Deleted Successfully!");
                else
                    System.out.println("Delete Failed!");

                break;

            case 5:

                System.out.println("Thank you!");
                sc.close();
                return;

            default:
                System.out.println("Invalid Choice");

            }

        }

    }
}