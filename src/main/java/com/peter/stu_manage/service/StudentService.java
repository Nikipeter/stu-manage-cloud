package com.peter.stu_manage.service;

import java.util.List;
import com.peter.stu_manage.entity.Student_entity;

public interface StudentService {

    List<Student_entity> getAllStudents();
    // it is a return type of list of students from type Student_entity
    // getAllStudents(); -> here it is an abstarct method without body, it will be written in StudentServiceImpl.java
    // same for all below codes!!!

    Student_entity saveStudent(Student_entity student);
    // here Student_entity is the return type
    // saveStudent(argument)

    Student_entity getStudentById(Long id);
    //same here

    void deleteStudentById(Long id);

}