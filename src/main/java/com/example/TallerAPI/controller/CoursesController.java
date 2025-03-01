package com.example.TallerAPI.controller;

import com.example.TallerAPI.models.Course;
import com.example.TallerAPI.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/courses")
@RestController
public class CoursesController {
    
    // We inject the service
    @Autowired
    private CoursesService coursesService;
    
    // Get all courses
    @GetMapping
    public List<Course> getCourses(){
        return coursesService.getAllCourses();
    }
    
    // Create a new course
    @PostMapping("/newCourse")
    public Course newCourse(@RequestBody Course course) {        
        return coursesService.newCourse(course);
    }

    // Endpoint with parameters in to URL
    @DeleteMapping("/deleteCourse/{id}")
    public void deleteCourse(@PathVariable Long id){
        coursesService.deleteCourseById(id);
    }
}
