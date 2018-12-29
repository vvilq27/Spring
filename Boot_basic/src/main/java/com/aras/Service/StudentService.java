package com.aras.Service;

import com.aras.Dao.FooStudentDao;
import com.aras.Dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.aras.Entity.Student;

import java.util.Collection;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public List<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }
//    public Student getStudentById(int id){
//        return fooStudentDaoImpl.getStudentById(id);
//    }

    public void createStudent(Student student){
        studentDao.createStudent(student);
    }
}
