package com.project.studentservice.services;


import com.project.studentservice.dbo.Student;
import com.project.studentservice.repositories.StudentDboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StudentService {

    @Autowired
    private StudentDboService dbo ;

    public StudentService(StudentDboService dbo) {
        this.dbo = dbo;
    }

    public List<Student> getAllStudents(){
        return dbo.findAll();
    }

    public Optional<Student> getStudentById(long id){
        return dbo.findById(id);
    }

    public Student saveStudent(Student student){
        return dbo.save(student);
    }

    public Student updateStudentInformation(Student student){
        return dbo.save(student);
    }

    public void deleteStudent(Student student){
         dbo.delete(student);
    }
}
