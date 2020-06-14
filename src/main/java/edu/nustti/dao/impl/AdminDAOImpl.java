package edu.nustti.dao.impl;

import edu.nustti.dao.AdminDAO;
import edu.nustti.entity.Admin;
import edu.nustti.util.DBHelper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDAOImpl implements AdminDAO {
    public Admin login(Admin admin) {
        String sql = "select * from admin where username = ? and password = ?";
        ResultSet rs = DBHelper.get(sql,admin.getUsername(),admin.getPassword());
        try {
            if (rs.next()){
                admin = new Admin(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                return admin;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
