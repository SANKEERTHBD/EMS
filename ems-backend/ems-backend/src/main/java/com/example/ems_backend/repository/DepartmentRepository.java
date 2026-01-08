package com.example.ems_backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems_backend.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
    Optional<Department>findByName(String name);
    boolean existsByName(String name);
}
