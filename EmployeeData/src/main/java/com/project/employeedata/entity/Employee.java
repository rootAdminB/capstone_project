package com.project.employeedata.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Employee")
public class Employee {

	
	@Id
	@Column(name = "Employee_ID")
	private long employeeID;

	@Column(name = "Employee_Name")
	private String employeeName;

	@Column(name = "Date_Of_Birth")
	private LocalDate dateOfBirth;

}
