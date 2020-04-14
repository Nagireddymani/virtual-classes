package com.springexercise2.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.springexercise2.demo.exception.EmptyStudentListException;
import com.springexercise2.demo.exception.StudentAlreadyExistException;
import com.springexercise2.demo.exception.StudentNotFoundException;

@RestController
@ControllerAdvice
public class StudentRestErrorController {
	
	@ResponseStatus(code = HttpStatus.NOT_FOUND, value = HttpStatus.NOT_FOUND,reason = "Student Not Found")
	@ExceptionHandler(StudentNotFoundException.class)
	public void handleStudentNotFoundException() {
		
	}
	
	@ResponseStatus(code = HttpStatus.ALREADY_REPORTED, value = HttpStatus.ALREADY_REPORTED,reason = "Student Already Exist")
	@ExceptionHandler(StudentAlreadyExistException.class)
	public void handleStudentAlreadyExistException() {
		
	}
	
	@ResponseStatus(code = HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS, value = HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS,reason = "No Student Found in Student Database")
	@ExceptionHandler(EmptyStudentListException.class)
	public void handleEmptyStudentListException() {
		
	}
}
