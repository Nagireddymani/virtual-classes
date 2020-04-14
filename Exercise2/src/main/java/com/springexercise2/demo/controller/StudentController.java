package com.springexercise2.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springexercise2.demo.model.Student;
import com.springexercise2.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired(required = false)
	StudentService studentService;
	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student)
	{
	   	return new ResponseEntity<Student>(studentService.addStudent(student),HttpStatus.OK);
	}
	@GetMapping("/id/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") int id)
	{
		
		return new ResponseEntity<Student>(studentService.getStudentById(id),HttpStatus.OK); 
			
    }
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents()
	{
		return new ResponseEntity<List<Student>>(studentService.getAllStudents(),HttpStatus.OK);
	}
	@GetMapping("/name/{studentName}")
	public ResponseEntity<Student> getStudentByName(@PathVariable String studentName)
	{
		 return new ResponseEntity<Student>(studentService.getStudentByName(studentName),HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/id/{studentId}")
    public boolean deleteStudentById(@PathVariable("studentId") int studentId)
    {
		    return studentService.deleteStudent(studentId);
    }
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student)
	{
		   return new ResponseEntity<Student>(studentService.updateStudent(student),HttpStatus.OK);
	}

}
