package com.springexercise2.demo.exception;

public class StudentAlreadyExistException extends RuntimeException {

	public StudentAlreadyExistException(String message)
	{
		super(message);
	}
}
