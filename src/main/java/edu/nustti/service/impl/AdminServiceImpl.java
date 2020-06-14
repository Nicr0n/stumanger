package edu.nustti.service.impl;

import edu.nustti.dao.AdminDAO;
import edu.nustti.dao.impl.AdminDAOImpl;
import edu.nustti.entity.Admin;
import edu.nustti.service.AdminService;

public class AdminServiceImpl implements AdminService {
    AdminDAO adminDAO = new AdminDAOImpl();
    public Admin login(String username, String password) {
        Admin admin = new Admin(null,null,username,password);
        return adminDAO.login(admin);
    }
}
