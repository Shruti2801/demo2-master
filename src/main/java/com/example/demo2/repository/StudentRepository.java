package com.example.demo2.repository;

import com.example.demo2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {
//    List<Student> findByName(String name);
}
