package com.aras.Dao;

import com.aras.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class FooFooStudentDaoImpl implements FooStudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Aro", "Park"));
                put(2, new Student(2, "Joe", "Banana"));
                put(3, new Student(3, "Tom", "Bacon"));
            }
        };
    }

    private List<Student> s = new ArrayList<Student>() {
        {
            add(new Student(1, "Aro", "Math"));
            add(new Student(2, "Daro", "Phisics"));
        }
    };

    public FooFooStudentDaoImpl() {
        System.out.println("HELLO DAO");
        System.out.println(s.get(0).toString());
    }

    public List<Student> getAllStudents() {
        return this.s;
    }

    @Override
    public Student getStudentById(int id) {
        return this.s.get(id);
    }

    @Override
    public Collection<Student> getStudents2() {
        return this.students.values();
    }

    @Override
    public void createStudent(Student student){
        students.put(student.getId(),student);
    }
}