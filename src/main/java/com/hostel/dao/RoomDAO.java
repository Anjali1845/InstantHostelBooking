package com.hostel.dao;

import java.sql.*;
import com.hostel.model.Room;
import com.hostel.util.DBConnection;

public class RoomDAO {

    public boolean addRoom(Room r) {

        String sql = "INSERT INTO rooms(room_no,type,capacity,status) VALUES(?,?,?,?)";

        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, r.getRoomNo());
            ps.setString(2, r.getType());
            ps.setInt(3, r.getCapacity());
            ps.setString(4, r.getStatus());

            return ps.executeUpdate() > 0;

        } catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
}