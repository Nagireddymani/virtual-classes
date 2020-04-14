package com.springexercise2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springexercise2.demo.model.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

	public Student getByStudentName(String studentName);
}
