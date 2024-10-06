package com.learnspring.springstudents.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.learnspring.springstudents.Models.Student;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
            Student.builder()
                .firstName("John")
                .lastName("Doe")
                .email("jdoe@me.com")
                .build(),
                
            Student.builder()
                .firstName("Jane")
                .lastName("Doe")
                .email("jdoe@me.com")
                .build()
        );
    }
}
