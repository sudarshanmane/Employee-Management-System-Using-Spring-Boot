package com.employee.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message = "name can not be null")
	@NotBlank(message = "name can not be blank")
	@NotEmpty(message = "name can not be empty")
	private String name;
	
	@NotNull(message = "address can not be null")
	@NotBlank(message = "address can not be blank")
	@NotEmpty(message = "address can not be empty")
	private String address;
	
	@NotNull(message = "salary can not be null")
	private Integer salary;
	
	@NotNull(message = "Email can not be null")
	@NotBlank(message = "Email can not be blank")
	@NotEmpty(message = "Email can not be empty")
	@Email(message = "please provide a correct email")
	private String email;
	
	private LocalDateTime registration_Date; 
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	

	public LocalDateTime getRegistration_Date() {
		return registration_Date;
	}
	public void setRegistration_Date(LocalDateTime registration_Date) {
		this.registration_Date = registration_Date;
	}
	public Employee() {
		super();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(Integer id,
			@NotNull(message = "name can not be null") @NotBlank(message = "name can not be blank") @NotEmpty(message = "name can not be empty") String name,
			@NotNull(message = "address can not be null") @NotBlank(message = "address can not be blank") @NotEmpty(message = "address can not be empty") String address,
			@NotNull(message = "salsrtcan not be null") @NotBlank(message = "name can not be blank") Integer salary,
			@NotNull(message = "Email can not be null") @NotBlank(message = "Email can not be blank") @NotEmpty(message = "Email can not be empty") @Email(message = "please provide a correct email") String email,
			LocalDateTime registration_Date) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.email = email;
		this.registration_Date = registration_Date;
	}
	
	
	public Employee(
			@NotNull(message = "name can not be null") @NotBlank(message = "name can not be blank") @NotEmpty(message = "name can not be empty") String name,
			@NotNull(message = "address can not be null") @NotBlank(message = "address can not be blank") @NotEmpty(message = "address can not be empty") String address,
			@NotNull(message = "salary can not be null") Integer salary,
			@NotNull(message = "Email can not be null") @NotBlank(message = "Email can not be blank") @NotEmpty(message = "Email can not be empty") @Email(message = "please provide a correct email") String email,
			LocalDateTime registration_Date) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.email = email;
		this.registration_Date = registration_Date;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", email="
				+ email + ", registration_Date=" + registration_Date + "]";
	}
	
	
}
