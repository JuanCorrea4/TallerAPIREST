package com.example.TallerAPI.repository;

import com.example.TallerAPI.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepository extends JpaRepository<Teacher, Long> {
    // Puedes agregar métodos personalizados si es necesario
}
