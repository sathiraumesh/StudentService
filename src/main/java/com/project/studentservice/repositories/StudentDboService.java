package com.project.studentservice.repositories;

import com.project.studentservice.dbo.Student;
import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentDboService extends JpaRepository<Student,Long> {
}
