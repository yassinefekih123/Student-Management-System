package com.sms.student_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sms.student_management.entity.Departement;

public interface DepartementRepository extends JpaRepository<Departement, Long> {
}