package org.example.demo_spring_data_jpa.service;

import org.example.demo_spring_data_jpa.entity.Student;
import org.example.demo_spring_data_jpa.exception.DuplicateAdmin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void add(Student student) throws DuplicateAdmin;
    Student findById(int id);

    Page<Student> search(String searchName, Pageable pageable);
}
