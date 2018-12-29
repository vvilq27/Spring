package com.aras.Controller;

import com.aras.Entity.Student;
import com.aras.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resources;
import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public String test(){
        return "ARAAAAAAAAAAAAAASU";
    }

    @RequestMapping(value = "students", method = RequestMethod.GET)
    public List getAllStudents(){
        return studentService.getAllStudents();
    }

//    @GetMapping(value = "students/{id}")
//    public Student getStudentById(@PathVariable("id") int id){
//        return studentService.getStudentById(id);
//    }

    @PostMapping(value = "createStudent", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createStudent(@RequestBody Student student){
        studentService.createStudent(student);
    }
}