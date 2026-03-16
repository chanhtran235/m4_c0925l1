package org.example.demo1.service;

import org.example.demo1.entity.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void add(Student student);
}
