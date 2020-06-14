package edu.nustti.dao;

import edu.nustti.entity.Student;

import java.util.List;

public interface StudentDAO {
    //1.查询所有学生
    List<Student> findAllStudent();

    //2.添加学生
    void addStudent(Student student);

    //3.删除学生
    void deleteStudent(Student student);

    //4.修改学生
    void updateStudent(Student student);

    //5.模糊查询学生
    List<Student> findStudentByKeyword(String keyword);

    //按照ID查询学生
    Student findStudentByID(Integer id);
}
