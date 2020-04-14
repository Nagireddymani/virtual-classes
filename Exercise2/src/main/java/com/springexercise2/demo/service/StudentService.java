package com.springexercise2.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springexercise2.demo.exception.EmptyStudentListException;
import com.springexercise2.demo.exception.StudentAlreadyExistException;
import com.springexercise2.demo.exception.StudentNotFoundException;
import com.springexercise2.demo.model.Student;
import com.springexercise2.demo.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired(required = false)
	StudentRepo studentRepo;
	 
	@Transactional
	public Student addStudent(Student student)
	{
		if(studentRepo.existsById(student.getStudentId()))
			throw new StudentAlreadyExistException("Student with id : " +student.getStudentId()+" is Already Exist");
		return studentRepo.save(student);
	}
	
	public Student getStudentById(int studentId)
	{
		if(!studentRepo.existsById(studentId)) 
		{	
		   throw new StudentNotFoundException("Student with id "+studentId+" Not Found");
		}
	    return studentRepo.getOne(studentId);
	}
	
	public List<Student> getAllStudents()
	{
	    if(studentRepo.count()==0)
	    	throw new EmptyStudentListException("No Student Found in Student Database");
		return studentRepo.findAll();
	}
	
	@Transactional
	public Student getStudentByName(String studentName)
	{
	    return studentRepo.getByStudentName(studentName);	
	}
	
	@Transactional
	public Student updateStudent(Student student)
	{
		
		if(!studentRepo.existsById(student.getStudentId()))
			throw new StudentNotFoundException("Student with id : " +student.getStudentId()+" Not Found");
	
		Student newStudent=studentRepo.getOne(student.getStudentId());
		newStudent.setStudentName(student.getStudentName());
		newStudent.setDob(student.getDob());
		
		studentRepo.save(newStudent);
		return newStudent;
	}
	
	@Transactional
	public boolean deleteStudent(int studentId)
	{
		if(!studentRepo.existsById(studentId)) 
		{	
		   throw new StudentNotFoundException("Student with id "+studentId+" Not Found");
		}
		studentRepo.deleteById(studentId);
		return !studentRepo.existsById(studentId);
	}
	
}
