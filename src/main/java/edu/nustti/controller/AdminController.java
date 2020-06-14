package edu.nustti.controller;

import edu.nustti.entity.Admin;
import edu.nustti.service.AdminService;
import edu.nustti.service.impl.AdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdminController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        AdminService adminService = new AdminServiceImpl();
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Admin admin = adminService.login(username,password);
        if(admin==null){//登录失败
            request.getSession().setAttribute("errormsg","<font color='red'>用户名或密码错误！</font>");
            response.sendRedirect("login.jsp");
        }else {//登录成功
            request.getSession().setAttribute("admin",admin);
            response.sendRedirect("index.html");
        }
        System.out.println("post");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
