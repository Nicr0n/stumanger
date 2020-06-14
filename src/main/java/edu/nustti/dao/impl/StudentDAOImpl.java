package edu.nustti.dao.impl;

import edu.nustti.dao.StudentDAO;
import edu.nustti.entity.Student;
import edu.nustti.util.DBHelper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    public List<Student> findAllStudent() {
        String sql = "select * from student";
        List<Student> students = new ArrayList<Student>();
        ResultSet rs = DBHelper.get(sql);
        try {
            while (rs.next()) {
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6));
                students.add(student);
            }
            return students;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addStudent(Student student) {
        String sql = "insert into student values(?,?,?,?,?,?)";
        DBHelper.update(sql, student.getId(), student.getSno(), student.getName(), student.getAge(), student.getSex(), student.getDepartment());
    }

    public void deleteStudent(Student student) {
        String sql = "delete from student where id = ?";
        DBHelper.update(sql, student.getId());
    }

    public void updateStudent(Student student) {
        String sql = "update student  set sno=?,name=?,age=?,sex=?,department=? where id=?";
        DBHelper.update(sql, student.getSno(), student.getName(), student.getAge(), student.getSex(), student.getDepartment(), student.getId());
    }

    public List<Student> findStudentByKeyword(String keyword) {
        String sql = "select * from student WHERE sno like ? or name LIKE ? or department LIKE ?";
        List<Student> students = new ArrayList<Student>();
        ResultSet rs = DBHelper.get(sql,"%"+keyword+"%","%"+keyword+"%","%"+keyword+"%");
        System.out.println(rs);
        try {
            while (rs.next()) {
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6));
                students.add(student);
            }
            return students;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Student findStudentByID(Integer id) {
        String sql = "select * from student where id = ?";
        ResultSet rs = DBHelper.get(sql,id);
        try {
            if (rs.next()) {
                Student student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6));
                return student;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
