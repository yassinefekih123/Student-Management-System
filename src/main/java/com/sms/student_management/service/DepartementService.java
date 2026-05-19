package com.sms.student_management.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sms.student_management.entity.Departement;
import com.sms.student_management.repository.DepartementRepository;

@Service
public class DepartementService {

    @Autowired
    private DepartementRepository repository;

    public Departement saveDepartment(Departement dept) {
        return repository.save(dept);
    }

    public List<Departement> getAllDepartments() {
        return repository.findAll();
    }

    public Departement getDepartmentById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Departement updateDepartment(Long id, Departement updated) {
        Departement existing = repository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updated.getName());
            existing.setCode(updated.getCode());
            existing.setDescription(updated.getDescription());
            return repository.save(existing);
        }
        return null;
    }

    public String deleteDepartment(Long id) {
        repository.deleteById(id);
        return "Department deleted successfully!";
    }
}