package com.example.TallerAPI.controller;

import com.example.TallerAPI.models.Teacher;
import com.example.TallerAPI.service.TeachersService;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/teachers")
@RestController

public class TeachersController {
    
    // We inject the service
    @Autowired
    private TeachersService teachersService;
    
    // Get all teachers
    @GetMapping
    public List<Teacher> getTeachers(){
        return teachersService.getAllTeachers();
    }
    
    // Create a new teacher
    @Transactional
    @PostMapping("/newTeacher")
    public Teacher newTeacher(@RequestBody Teacher teacher) {        
        return teachersService.newTeacher(teacher);
    }

    // Endpoint with parameters in to URL
    @Transactional
    @DeleteMapping("/deleteTeacher/{id}")
    public void deleteTeacher(@PathVariable Long id){
        teachersService.deleteTeacherById(id);
    }    
}
