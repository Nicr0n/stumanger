package edu.nustti.entity;

public class Student {
    private Integer id;
    private String sno;
    private String name;
    private Integer age;
    private String sex;
    private String department;

    public Student() {
    }

    public Student(Integer id, String sno, String name, Integer age, String sex, String department) {
        this.id = id;
        this.sno = sno;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
