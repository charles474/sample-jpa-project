package com.tutorial.samplejpaproject.controller;

import com.tutorial.samplejpaproject.entities.Student;
import com.tutorial.samplejpaproject.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentServiceImpl studentServiceImpl;

    @Autowired
    public StudentController(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @RequestMapping (path = "/addStudent", method = RequestMethod.POST)
    public void addStudent(@RequestBody Student student){
        studentServiceImpl.addStudent(student);
    }

    @RequestMapping (path = "/addStudents", method = RequestMethod.POST)
    public void addStudent(@RequestBody List<Student> students){
        studentServiceImpl.addStudents(students);
    }

    @RequestMapping (path = "/getStudents", method = RequestMethod.GET)
    public List<Student> getStudents(){
        return studentServiceImpl.getStudents();
    }

    @RequestMapping (path = "/getStudentByEmail", method = RequestMethod.POST)
    public Student getStudents(@RequestParam String email){
        return studentServiceImpl.findStudentByEmail(email);
    }
}
