package com.springexercise2.demo.exception;

public class EmptyStudentListException extends RuntimeException {

	public EmptyStudentListException(String message)
	{
		super(message);
	}
}
