package com.springboot.ems.service;

import com.springboot.ems.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    void deleteStudentById(Long id);

    Student updateStudent(Student student);
}
