package com.example.student_enrollment_system.controller;


import com.example.student_enrollment_system.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;



}
