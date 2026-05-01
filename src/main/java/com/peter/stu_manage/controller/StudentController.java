package com.peter.stu_manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.peter.stu_manage.entity.Student_entity;
import com.peter.stu_manage.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    // READ - Show all students on home page
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "index";
    }

    // Show blank Add Student form
    @GetMapping("/showNewStudentForm")
    public String showNewStudentForm(Model model) {
        // ✅ FIXED — using Student_entity instead of Student
        Student_entity student = new Student_entity();
        model.addAttribute("student", student);
        return "new_student";
    }

    // Save new student to DB
    @PostMapping("/saveStudent")
    // ✅ FIXED — using Student_entity instead of Student
    public String saveStudent(@ModelAttribute("student") Student_entity student) {
        studentService.saveStudent(student);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model) {
        Student_entity student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "new_student";
    }

     @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/";
    }


}