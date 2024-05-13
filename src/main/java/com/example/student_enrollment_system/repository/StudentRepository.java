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

    @Query("SELECT s FROM Student s WHERE s.name = :name AND s.courses = :course")
    List<Student> findByNameAndCourse(@Param("name") String name, @Param("course") String course);

    @Query("SELECT s FROM Student s WHERE s.enrollmentDate BETWEEN :start AND :end")
    List<Student> findByEnrollmentDateBetween(@Param("start") Date start, @Param("end") Date end);

    @Query("SELECT s FROM Student s ORDER BY s.enrollmentDate DESC")
    List<Student> findAllByOrderByEnrollmentDateDesc();
}
