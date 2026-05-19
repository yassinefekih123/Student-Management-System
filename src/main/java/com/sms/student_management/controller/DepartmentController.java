package com.sms.student_management.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sms.student_management.entity.Departement;
import com.sms.student_management.service.DepartementService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartementService service;

    @PostMapping
    public Departement addDepartment(@RequestBody Departement dept) {
        return service.saveDepartment(dept);
    }

    @GetMapping
    public List<Departement> getAllDepartments() {
        return service.getAllDepartments();
    }

    @GetMapping("/{id}")
    public Departement getDepartmentById(@PathVariable Long id) {
        return service.getDepartmentById(id);
    }

    @PutMapping("/{id}")
    public Departement updateDepartment(@PathVariable Long id, @RequestBody Departement dept) {
        return service.updateDepartment(id, dept);
    }

    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable Long id) {
        return service.deleteDepartment(id);
    }
}