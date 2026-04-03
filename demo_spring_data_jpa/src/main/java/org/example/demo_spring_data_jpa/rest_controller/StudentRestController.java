package org.example.demo_spring_data_jpa.rest_controller;


import org.example.demo_spring_data_jpa.dto.StudentDto;
import org.example.demo_spring_data_jpa.entity.Student;
import org.example.demo_spring_data_jpa.exception.DuplicateAdmin;
import org.example.demo_spring_data_jpa.service.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/students")
public class StudentRestController {
    @Autowired
    private IStudentService studentService;
    @GetMapping("")
    public ResponseEntity<List<Student>> getAll(){
        List<Student> students = studentService.findAll();
        if (students.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);// 204
        }
        return new ResponseEntity<>(students,HttpStatus.OK);// 200
    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> findById(@PathVariable(name = "id")int id){
        Student student = studentService.findById(id);
        if (student==null){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);// 204
        }
        return new ResponseEntity<>(student,HttpStatus.OK);// 200
    }
    @PostMapping("")
    public ResponseEntity<?> add(@RequestBody StudentDto studentDto) throws DuplicateAdmin {
        Student student = new Student();
        BeanUtils.copyProperties(studentDto,student);
        studentService.add(student);
        return new ResponseEntity<>(student,HttpStatus.CREATED);// 201
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteById(@PathVariable(name = "id")int id){

        // gọi service để xoá

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);// 204
    }
}
