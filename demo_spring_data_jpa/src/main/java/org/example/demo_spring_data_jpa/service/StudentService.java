package org.example.demo_spring_data_jpa.service;

import org.example.demo_spring_data_jpa.entity.Student;
import org.example.demo_spring_data_jpa.exception.DuplicateAdmin;
import org.example.demo_spring_data_jpa.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService implements IStudentService{
   @Autowired
   private IStudentRepository studentRepository;
    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void add(Student student) throws DuplicateAdmin {
        if (student.getName().equals("Admin")){
            throw new DuplicateAdmin("Ten trung voi admin");
        }
       studentRepository.save(student);
    }

    @Override
    public Student findById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Student> search(String searchName, Pageable pageable) {
        return studentRepository.search(searchName,pageable);
    }
}
