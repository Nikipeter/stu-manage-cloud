package com.peter.stu_manage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.peter.stu_manage.entity.Student_entity;

public interface StudentRepository extends JpaRepository<Student_entity, Long> {

}