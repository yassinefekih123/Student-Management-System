package com.sms.student_management.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.student_management.entity.Student;
import com.sms.student_management.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    // CREATE
    public Student saveStudent(Student student) {

        return repository.save(student);
    }

    // READ ALL
    public List<Student> getAllStudents() {

        return repository.findAll();
    }

    // READ BY ID
    public Student getStudentById(Long id) {

        Optional<Student> student =
                repository.findById(id);

        return student.orElse(null);
    }

    // UPDATE
    public Student updateStudent(Long id,
                                 Student updatedStudent) {

        Student existingStudent =
                repository.findById(id).orElse(null);

        if (existingStudent != null) {

            existingStudent.setName(
                    updatedStudent.getName());

            existingStudent.setAge(
                    updatedStudent.getAge());

            return repository.save(existingStudent);
        }

        return null;
    }

    // DELETE
    public String deleteStudent(Long id) {

        repository.deleteById(id);

        return "Student deleted successfully!";
    }
}