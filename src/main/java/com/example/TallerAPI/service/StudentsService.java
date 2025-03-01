package com.example.TallerAPI.service;

import java.util.List;

import com.example.TallerAPI.models.Student;
import com.example.TallerAPI.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsService {

    @Autowired
    private StudentsRepository studentsRespository;

    // Get all students
    public List<Student> getAllStudents() {
        try {
            return studentsRespository.findAll();
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error al obtener los estudiantes: " + e.getMessage());
            throw new RuntimeException("Error al obtener los estudiantes", e);
        }
    }

    // Create a new student
    public Student newStudent(Student student) {
        try {
            return studentsRespository.save(student);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error al guardar el estudiante: " + e.getMessage());
            throw new RuntimeException("Error al guardar el estudiante", e);
        }
    }

    // Delete a student
    public void deleteStudentById(Long id) {
        try {
            studentsRespository.deleteById(id);
        } catch (Exception e) {
            // Loguear la excepción
            System.out.println("Error al eliminar el estudiante: " + e.getMessage());
            throw new RuntimeException("Error al eliminar el estudiante", e);
        }
    }
}
