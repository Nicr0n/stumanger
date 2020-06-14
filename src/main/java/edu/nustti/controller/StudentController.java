package edu.nustti.controller;

import edu.nustti.entity.Student;
import edu.nustti.service.StudentService;
import edu.nustti.service.impl.StudentSetviceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        StudentService studentService = new StudentSetviceImpl();
        String action = request.getParameter("action");
        if(("findall").equals(action)){
            System.out.println("查询所有学生");
            //查询
            List<Student> students = studentService.findAllStudent();
            request.getSession().setAttribute("students",students);
            response.sendRedirect("right.jsp");
        }else if(("delete").equals(action)){
            System.out.println("删除学生");
            //删除
            Integer id = Integer.parseInt(request.getParameter("id"));
            studentService.deleteStudent(id);
            //跳转
            List<Student> students = studentService.findAllStudent();
            request.getSession().setAttribute("students",students);
            response.sendRedirect("right.jsp");
        }else if(("add").equals(action)){
            System.out.println("新增操作");
            //新增
            String sno = request.getParameter("sno");
            String name = request.getParameter("name");
            Integer age = Integer.parseInt(request.getParameter("age"));
            String sex = request.getParameter("sex");
            String department = request.getParameter("department");
            studentService.addStudent(sno,name,age,sex,department);
            //跳转
            List<Student> students = studentService.findAllStudent();
            request.getSession().setAttribute("students",students);
            response.sendRedirect("right.jsp");
        }else if(("findbykeyword").equals(action)){
            //模糊查询
            System.out.println("模糊查询");
            String keyword = request.getParameter("keyword");
            List<Student> students = studentService.findStudentByKeyword(keyword);
            request.getSession().setAttribute("students",students);
            response.sendRedirect("right.jsp");
        }else if(("toupdate").equals(action)){
            //前往修改页面
            System.out.println("前往修改页面");
            String id = request.getParameter("id");
            Student student = studentService.findStudentByID(Integer.parseInt(id));
            request.getSession().setAttribute("student",student);
            response.sendRedirect("update.jsp");
        }else if(("update").equals(action)){
            //修改
            System.out.println("修改");
            Integer id = Integer.parseInt(request.getParameter("id"));
            String sno = request.getParameter("sno");
            String name = request.getParameter("name");
            Integer age = Integer.parseInt(request.getParameter("age"));
            String sex = request.getParameter("sex");
            String department = request.getParameter("department");
            studentService.updateStudent(id,sno,name,age,sex,department);
            //跳转
            List<Student> students = studentService.findAllStudent();
            request.getSession().setAttribute("students",students);
            response.sendRedirect("right.jsp");
        }
    }
}
