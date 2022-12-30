package com.employee.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.employee.model.EmployeeExceptionDetails;

@ControllerAdvice
public class EmployeeExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<EmployeeExceptionDetails> emplpyeeException(Exception exception, WebRequest request){
		
		EmployeeExceptionDetails employeeException = new EmployeeExceptionDetails(LocalDateTime.now(),exception.getMessage(),request.getDescription(false));
		return new ResponseEntity<EmployeeExceptionDetails>(employeeException,HttpStatus.INTERNAL_SERVER_ERROR);
	
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<EmployeeExceptionDetails> validation(MethodArgumentNotValidException e,WebRequest request){
		
		EmployeeExceptionDetails details= new EmployeeExceptionDetails(LocalDateTime.now(),e.getBindingResult().getFieldError().getDefaultMessage(),request.getDescription(false));
		return new ResponseEntity<EmployeeExceptionDetails>(details,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<EmployeeExceptionDetails> noHandler(NoHandlerFoundException e,WebRequest request){
		EmployeeExceptionDetails details= new EmployeeExceptionDetails(LocalDateTime.now(),"No handler Found. Please check the method you are using.", request.getDescription(false));
		return new ResponseEntity<EmployeeExceptionDetails>(details,HttpStatus.BAD_REQUEST);
		
	}
	
}
