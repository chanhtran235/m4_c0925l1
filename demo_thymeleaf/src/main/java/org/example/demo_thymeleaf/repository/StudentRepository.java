package org.example.demo_thymeleaf.repository;

import jakarta.persistence.TypedQuery;
import org.example.demo_thymeleaf.entity.Student;
import org.example.demo_thymeleaf.util.ConnectionUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository implements IStudentRepository {
    @Override
    public List<Student> findAll() {
        Session session = ConnectionUtil.sessionFactory.openSession();
//        TypedQuery<Student> query = session.createQuery("from Student");
        TypedQuery<Student> query = session.createNativeQuery("select * from student", Student.class);
        List<Student> studentList = query.getResultList();
        session.close();
        return studentList;
    }

    @Override
    public void add(Student student) {
        Session session = ConnectionUtil.sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        session.save(student);
        transaction.commit();
    }

    @Override
    public Student findById(int id) {
        Session session = ConnectionUtil.sessionFactory.openSession();
        return session.find(Student.class,id);
    }
}
