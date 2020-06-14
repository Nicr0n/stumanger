package edu.nustti.test;

import edu.nustti.dao.StudentDAO;
import edu.nustti.dao.impl.StudentDAOImpl;
import edu.nustti.entity.Student;

import java.util.Iterator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImpl();
        List<Student> students= studentDAO.findStudentByKeyword("小");
        Iterator<Student> it = students.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }
    }
}
