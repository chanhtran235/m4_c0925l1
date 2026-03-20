package org.example.demo_thymeleaf.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.example.demo_thymeleaf.entity.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Student> findAll() {
         TypedQuery<Student> query = entityManager.createQuery("FROM Student ",Student.class);
        return query.getResultList();
    }

    @Transactional
    @Override
    public void add(Student student) {
         entityManager.persist(student);
    }

    @Override
    public Student findById(int id) {
        return entityManager.find(Student.class,id);
    }
}
