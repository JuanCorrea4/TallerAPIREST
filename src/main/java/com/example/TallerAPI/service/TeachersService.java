package com.example.TallerAPI.service;

import java.util.List;

import com.example.TallerAPI.models.Teacher;
import com.example.TallerAPI.repository.TeachersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeachersService {
 
    @Autowired
    private TeachersRepository teacherRepository;

    // Get all Teachers
    public List<Teacher> getAllTeachers() {
        try {
            return teacherRepository.findAll();
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error getting teachers: " + e.getMessage());
            throw new RuntimeException("Error getting teachers", e);
        }
    }

    // Create a new teacher
    public Teacher newTeacher(Teacher teacher) {
        try {
            return teacherRepository.save(teacher);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error saving teacher: " + e.getMessage());
            throw new RuntimeException("Error saving teacher", e);
        }
    }

    // Delete a teacher
    public void deleteTeacherById(Long id) {
        try {
            teacherRepository.deleteById(id);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error deleting teacher: " + e.getMessage());
            throw new RuntimeException("Error deleting teacher", e);
        }
    }   
}
