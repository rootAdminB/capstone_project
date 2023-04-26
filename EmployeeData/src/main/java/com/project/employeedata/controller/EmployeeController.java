package com.project.employeedata.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.employeedata.entity.Employee;
import com.project.employeedata.exception.EmployeeIDException;
import com.project.employeedata.exception.InValidEmployeeIDException;
import com.project.employeedata.service.EmployeeService;
import com.project.employeedata.vo.EmployeeVO;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/capstone/Employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@GetMapping("/get/{employeeID}")
	public EmployeeVO getEmployeeById(@PathVariable long employeeID)
			throws EmployeeIDException, InValidEmployeeIDException {
		log.info("Getting user by ID: {}", employeeID + " checking..............");
		
		return employeeService.getEmployeeById(employeeID);
	}

}
