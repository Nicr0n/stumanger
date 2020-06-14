package edu.nustti.service;

import edu.nustti.entity.Admin;

public interface AdminService {
    //登录
    Admin login(String username,String password);
}
