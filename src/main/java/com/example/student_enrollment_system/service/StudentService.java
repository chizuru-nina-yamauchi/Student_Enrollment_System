package com.example.student_enrollment_system.service;

import com.example.student_enrollment_system.model.Student;
import com.example.student_enrollment_system.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public List<Student> getStudentsByCourse(String course) {
        return repository.findByCourses(course);
    }

    public List<Student> getStudentsEnrolledAfter(Date date) {
        return repository.findStudentsEnrolledAfter(date);
    }

    public List<Student> getStudentsByNameContaining(String name) {
        return repository.findByNameContaining(name);
    }

}
