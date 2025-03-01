package com.example.TallerAPI.repository;

import com.example.TallerAPI.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoursesRepository extends JpaRepository<Course, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
