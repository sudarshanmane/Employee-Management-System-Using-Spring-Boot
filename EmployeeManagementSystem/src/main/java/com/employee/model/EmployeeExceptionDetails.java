package com.employee.model;

import java.time.LocalDateTime;

public class EmployeeExceptionDetails {
	
	private LocalDateTime dateTime;
	private String message;
	private String desc;
	
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public EmployeeExceptionDetails(LocalDateTime dateTime, String message, String desc) {
		super();
		this.dateTime = dateTime;
		this.message = message;
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "EmployeeExceptionDetails [dateTime=" + dateTime + ", message=" + message + ", desc=" + desc + "]";
	}
	public EmployeeExceptionDetails() {
		super();
	}
	
	

}
