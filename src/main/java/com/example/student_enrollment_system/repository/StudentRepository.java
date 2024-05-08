package com.example.student_enrollment_system.repository;

import com.example.student_enrollment_system.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByCourses(String course);

    @Query("SELECT s FROM Student s WHERE s.enrollmentDate > :certainDate")
    List<Student>  findStudentsEnrolledAfter(@Param("certainDate") Date date);

    List<Student> findByNameContaining(String name);
}
