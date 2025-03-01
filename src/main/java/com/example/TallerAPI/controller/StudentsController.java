package com.example.TallerAPI.controller;

import com.example.TallerAPI.models.Student;
import com.example.TallerAPI.service.StudentsService;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/students")
@RestController
public class StudentsController {
    
    // We inject the service
    @Autowired
    private StudentsService studentsService;
    
    // Get all students
    @GetMapping
    public List<Student> getStudents(){
        return studentsService.getAllStudents();
    }
    
    // Create a new student
    @Transactional
    @PostMapping("/newStudent")
    public Student newStudent(@RequestBody Student student) {        
        return studentsService.newStudent(student);
    }

    // Endpoint with parameters in to URL
    @Transactional    
    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Long id){
        studentsService.deleteStudentById(id);
    }
}
