package com.project.studentservice.controllers;

import com.project.studentservice.dbo.Student;
import com.project.studentservice.exceptions.StudentNotFoundException;
import com.project.studentservice.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentServicesController {

    @Autowired
    StudentService studentService;

    @GetMapping(value="/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping(value="/students/{id}")
    public Student getAllStudents(@PathVariable long id){
        Optional<Student> student = studentService.getStudentById(id);
        if(student.isPresent()){
            return student.get();
        }else {
            throw new StudentNotFoundException("Student not found");
        }
    }

}
