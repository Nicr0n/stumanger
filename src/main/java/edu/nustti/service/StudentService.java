package edu.nustti.service;

import edu.nustti.dao.StudentDAO;
import edu.nustti.dao.impl.StudentDAOImpl;
import edu.nustti.entity.Student;

import java.util.List;

public interface StudentService {
    //1.查询所有学生
    List<Student> findAllStudent();

    //2.添加学生
    void addStudent(String sno,String name,Integer age,String sex, String department);

    //3.删除学生
    void deleteStudent(Integer id);

    //4.修改学生
    void updateStudent(Integer id,String sno,String name,Integer age,String sex, String department);

    //5.模糊查询学生
    List<Student> findStudentByKeyword(String keyword);

    //6.按照ID查找学生
    Student findStudentByID(Integer id);
}
