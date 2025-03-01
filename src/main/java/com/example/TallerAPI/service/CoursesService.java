package com.example.TallerAPI.service;

import java.util.List;

import com.example.TallerAPI.models.Course;
import com.example.TallerAPI.repository.CoursesRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoursesService {

    @Autowired
    private CoursesRepository coursesRepository;

    // Get all students
    public List<Course> getAllCourses() {
        try {
            return coursesRepository.findAll();
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error getting courses: " + e.getMessage());
            throw new RuntimeException("Error getting courses", e);
        }
    }

    // Create a new student
    @Transactional    
    public Course newCourse(Course course) {
        try {
            return coursesRepository.save(course);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error saving course: " + e.getMessage());
            throw new RuntimeException("Error saving course", e);
        }
    }

    // Delete a student
    @Transactional    
    public void deleteCourseById(Long id) {
        try {
            coursesRepository.deleteById(id);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error deleting course: " + e.getMessage());
            throw new RuntimeException("Error deleting course", e);
        }
    }
}
