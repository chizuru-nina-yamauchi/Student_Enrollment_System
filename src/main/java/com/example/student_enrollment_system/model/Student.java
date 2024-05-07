package com.example.student_enrollment_system.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;

    @Temporal(TemporalType.DATE)
    private Date enrollmentDate;


    public Long getId() {
        return id;
    }

}
