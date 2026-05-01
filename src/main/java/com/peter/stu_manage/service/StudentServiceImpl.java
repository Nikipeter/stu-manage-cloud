package com.peter.stu_manage.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peter.stu_manage.entity.Student_entity;
import com.peter.stu_manage.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student_entity> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student_entity saveStudent(Student_entity student) {
        return repository.save(student);
    }

    @Override
    public Student_entity getStudentById(Long id) {
        Optional<Student_entity> result = repository.findById(id);
        return result.orElseThrow(() -> new RuntimeException("Student not found for ID: " + id)
        );
    }

    @Override
    public void deleteStudentById(Long id) {
        repository.deleteById(id);
    }
    
}