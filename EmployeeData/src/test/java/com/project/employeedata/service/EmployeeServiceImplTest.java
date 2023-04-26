package com.project.employeedata.service;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.project.employeedata.exception.InValidEmployeeIDException;
import com.project.employeedata.repository.EmployeeRepository;
import com.project.employeedata.vo.EmployeeVO;

@SpringBootTest
class EmployeeServiceImplTest {

	
	@Autowired
	EmployeeService employeeService;

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void testGetByEmployeeID() throws InValidEmployeeIDException {
		EmployeeVO employeeID = employeeService.getEmployeeById(16103);
		
		assertEquals("Nandan",employeeID.getEmployeeName());
		
	}
	

}
