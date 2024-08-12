package com.Student.Model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Student {
	@jakarta.persistence.Id
	 @GeneratedValue (strategy = GenerationType.IDENTITY)
	 Long id;
	 String name;
	 String gender;
	 String department;
	 
	 
	public Student() {
		super();
	}


	public Student(Long id, String name, String gender, String department) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.department = department;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}
	
}

	
	