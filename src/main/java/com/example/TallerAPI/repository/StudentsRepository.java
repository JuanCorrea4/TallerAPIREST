package com.example.TallerAPI.repository;

import com.example.TallerAPI.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Student, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
