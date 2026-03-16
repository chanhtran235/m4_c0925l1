package org.example.demo1.service;

import org.example.demo1.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService2  implements IStudentService{
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1, "hải"));
        studentList.add(new Student(2, "tiến"));
    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void add(Student student) {

    }
}
