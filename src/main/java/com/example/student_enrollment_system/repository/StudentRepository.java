package com.example.student_enrollment_system.repository;

import com.example.student_enrollment_system.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
