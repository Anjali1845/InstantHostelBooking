package com.hostel.gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

import com.hostel.dao.StudentDAO;
import com.hostel.model.Student;

public class StudentPage extends JFrame {

    JTable table;
    DefaultTableModel model;

    public StudentPage() {

        setTitle("Students");
        setSize(800,500);
        setLocationRelativeTo(null);

        model = new DefaultTableModel();

        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Email");
        model.addColumn("Phone");
        model.addColumn("Course");
        model.addColumn("Room");

        table = new JTable(model);

        add(new JScrollPane(table));

        loadStudents();

        setVisible(true);
    }

    void loadStudents(){

        model.setRowCount(0);

        StudentDAO dao = new StudentDAO();

        List<Student> list = dao.getAllStudents();

        for(Student s : list){

            model.addRow(new Object[]{
                    s.getId(),
                    s.getName(),
                    s.getEmail(),
                    s.getPhone(),
                    s.getCourse(),
                    s.getRoomNo()
            });

        }

    }

}