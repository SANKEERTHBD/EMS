package com.example.ems_backend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ems_backend.entity.Employee;
import com.example.ems_backend.enums.EmployeeStatus;

public interface EmployeeRepository extends JpaRepository<Employee,Long>//takes as object so LONG
//WHY INTERFACE BCZ WE CAN JUST GIVE THE RULES THE SB WILL AUTOMATICALLY FETCH THE EXISTING METHODS
//IF USED CLASS WE NEED TO WRITE THE SQL QUERIES AND ALL
 {
    Optional<Employee>findByEmail(String email);
    List<Employee>findByStatus(EmployeeStatus status);
    boolean existsByEmail(String email);
}
