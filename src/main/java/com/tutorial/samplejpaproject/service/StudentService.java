package com.tutorial.samplejpaproject.service;

import com.tutorial.samplejpaproject.entities.Student;

import java.util.List;

public interface StudentService {

    public void addStudent(Student student);

    public void addStudents(List<Student> students);

    public List<Student> getStudents();

    public Student findStudentByEmail(String email);
}
