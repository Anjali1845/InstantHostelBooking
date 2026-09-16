package com.hostel.gui;

import javax.swing.*;
import java.awt.*;
import com.hostel.dao.RoomDAO;
import com.hostel.model.Room;

public class RoomPage extends JFrame {

    JTextField roomNo = new JTextField();
    JTextField type = new JTextField();
    JTextField capacity = new JTextField();
    JComboBox<String> status =
            new JComboBox<>(new String[]{"Available","Occupied"});

    public RoomPage(){

        setTitle("Room Management");
        setSize(450,350);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(6,2,10,10));

        add(new JLabel("Room No"));
        add(roomNo);

        add(new JLabel("Type"));
        add(type);

        add(new JLabel("Capacity"));
        add(capacity);

        add(new JLabel("Status"));
        add(status);

        JButton save = new JButton("Save Room");
        add(save);

        save.addActionListener(e->saveRoom());

        setVisible(true);
    }

    void saveRoom(){

        Room r = new Room();

        r.setRoomNo(roomNo.getText());
        r.setType(type.getText());
        r.setCapacity(Integer.parseInt(capacity.getText()));
        r.setStatus(status.getSelectedItem().toString());

        RoomDAO dao = new RoomDAO();

        if(dao.addRoom(r))
            JOptionPane.showMessageDialog(this,"Room Added!");
        else
            JOptionPane.showMessageDialog(this,"Failed");
    }
}