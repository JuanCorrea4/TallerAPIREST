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
            System.out.println("Error al obtener los cursos: " + e.getMessage());
            throw new RuntimeException("Error al obtener los cursos", e);
        }
    }

    // Create a new student
    @Transactional    
    public Course newCourse(Course course) {
        try {
            return coursesRepository.save(course);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error al guardar el curso: " + e.getMessage());
            throw new RuntimeException("Error al guardar el curso", e);
        }
    }

    // Delete a student
    @Transactional    
    public void deleteCourseById(Long id) {
        try {
            coursesRepository.deleteById(id);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error al eliminar el curso: " + e.getMessage());
            throw new RuntimeException("Error al eliminar el curso", e);
        }
    }
}
