package com.aras.Dao;

import com.aras.Entity.Student;

import java.util.Collection;
import java.util.List;

public interface FooStudentDao {
    List getAllStudents();

    Student getStudentById(int id);

    Collection<Student> getStudents2();

    void createStudent(Student student);
}
