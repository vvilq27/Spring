package com.aras.Entity;


import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "course")
    private String course;

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
    }

    public  Student(){

    }

    public Student(int id, String name, String course) {
        super();
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

}
