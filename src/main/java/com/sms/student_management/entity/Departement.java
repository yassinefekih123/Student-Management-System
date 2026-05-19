package com.sms.student_management.entity;

import jakarta.persistence.*;

@Entity
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;       // e.g. "Computer Science"
    private String code;       // e.g. "CS"
    private String description;

    public Departement() {}

    public Departement(String name, String code, String description) {
        this.name = name;
        this.code = code;
        this.description = description;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}