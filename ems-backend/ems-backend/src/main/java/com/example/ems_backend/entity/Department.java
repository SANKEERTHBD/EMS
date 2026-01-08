package com.example.ems_backend.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="departments")
public class Department {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true,nullable=false)
    private String name;
    
    private String descrption;

    @ManyToOne
    @JoinColumn(name="manager_id")
    private Employee manager;

    private boolean isActive=true;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
