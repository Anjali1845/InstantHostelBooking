package com.hostel.gui;

import com.hostel.gui.RoomPage;
import com.hostel.gui.StudentPage;
import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    public Dashboard() {

        setTitle("Hostel Management System");
        setSize(900, 550);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Sidebar
        JPanel sidebar = new JPanel();
        sidebar.setBackground(new Color(33,43,54));
        sidebar.setPreferredSize(new Dimension(180,550));
        sidebar.setLayout(new GridLayout(8,1,10,10));

        JLabel title = new JLabel("HOSTEL",SwingConstants.CENTER);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Arial",Font.BOLD,22));

        JButton students = new JButton("Students");
        students.addActionListener(e -> new StudentPage());
        JButton rooms = new JButton("Rooms");
        rooms.addActionListener(e -> new RoomPage());
        JButton payments = new JButton("Payments");

        sidebar.add(title);
        sidebar.add(students);
        sidebar.add(rooms);
        sidebar.add(payments);

        // Main Panel
        JPanel main = new JPanel();
        main.setBackground(new Color(245,245,245));
        main.setLayout(null);

        JLabel heading = new JLabel("Hostel Dashboard");
        heading.setBounds(30,20,300,35);
        heading.setFont(new Font("Arial",Font.BOLD,26));

        JPanel card1=createCard("Students","24");
        JPanel card2=createCard("Rooms","40");
        JPanel card3=createCard("Available","16");

        card1.setBounds(30,80,180,100);
        card2.setBounds(240,80,180,100);
        card3.setBounds(450,80,180,100);

        main.add(heading);
        main.add(card1);
        main.add(card2);
        main.add(card3);

        add(sidebar,BorderLayout.WEST);
        add(main,BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createCard(String title,String value){

        JPanel p=new JPanel();
        p.setBackground(Color.WHITE);
        p.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        p.setLayout(new BorderLayout());

        JLabel t=new JLabel(title,SwingConstants.CENTER);
        t.setFont(new Font("Arial",Font.BOLD,18));

        JLabel v=new JLabel(value,SwingConstants.CENTER);
        v.setFont(new Font("Arial",Font.BOLD,30));

        p.add(t,BorderLayout.NORTH);
        p.add(v,BorderLayout.CENTER);

        return p;
    }
}