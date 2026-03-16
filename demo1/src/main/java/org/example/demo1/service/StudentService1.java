package org.example.demo1.service;

import org.example.demo1.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StudentService1 implements IStudentService{
    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1, "chánh",true, List.of("JS", "JAVA", "SQL").toArray(new String[0]),1));
        studentList.add(new Student(2, "chánh2",true, List.of("JS", "JAVA", "SQL").toArray(new String[0]),1));

    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }
}
