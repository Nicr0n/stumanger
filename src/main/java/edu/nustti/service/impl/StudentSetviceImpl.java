package edu.nustti.service.impl;

import edu.nustti.dao.StudentDAO;
import edu.nustti.dao.impl.StudentDAOImpl;
import edu.nustti.entity.Student;
import edu.nustti.service.StudentService;

import java.util.List;

public class StudentSetviceImpl implements StudentService {
    StudentDAO studentDAO = new StudentDAOImpl();

    public List<Student> findAllStudent() {
        return studentDAO.findAllStudent();
    }

    public void addStudent(String sno, String name, Integer age, String sex, String department) {
        Student student= new Student(null,sno,name,age,sex,department);
        studentDAO.addStudent(student);
    }

    public void deleteStudent(Integer id) {
        Student student= new Student(id,null,null,null,null,null);
        studentDAO.deleteStudent(student);
    }

    public void updateStudent(Integer id, String sno, String name, Integer age, String sex, String department) {
        Student student= new Student(id,sno,name,age,sex,department);
        studentDAO.updateStudent(student);
    }

    public List<Student> findStudentByKeyword(String keyword) {
        return studentDAO.findStudentByKeyword(keyword);
    }

    public Student findStudentByID(Integer id){
        return studentDAO.findStudentByID(id);
    }
}
