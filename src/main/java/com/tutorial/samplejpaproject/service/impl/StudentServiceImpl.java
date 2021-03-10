package com.tutorial.samplejpaproject.service.impl;

import com.tutorial.samplejpaproject.entities.Student;
import com.tutorial.samplejpaproject.repository.StudentRepository;
import com.tutorial.samplejpaproject.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void addStudent(Student student) {
        Student dbStudent = studentRepository.findStudentByEmail(student.getEmail());
        if(null != dbStudent && !dbStudent.getEmail().equals(student.getEmail())){
            studentRepository.save(student);
        }
    }

    @Override
    public void addStudents(List<Student> students) {
        studentRepository.saveAll(students);
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findStudentByEmail(String email) {
        return studentRepository.findStudentByEmail(email);
    }

}
