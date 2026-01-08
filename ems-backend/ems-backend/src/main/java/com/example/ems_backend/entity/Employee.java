package com.example.ems_backend.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(unique=true,nullable = false)
    private String employee_code;

    private String firstname;
    private String lastname;

    @Column(unique=true,nullable=false)
    private String email;
    
    private String phone;

    private LocalDate joining_date;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus status;
    
    private boolean isActive = true;

     @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

     @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;



    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
