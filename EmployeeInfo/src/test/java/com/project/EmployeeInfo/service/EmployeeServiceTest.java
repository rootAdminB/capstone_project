package com.project.EmployeeInfo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.EmployeeInfo.entity.Employee;
import com.project.EmployeeInfo.exception.ResourceNotFoundException;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

	
	@InjectMocks
    private EmployeeService employeeService;
	
	@Test
	void testFindById() throws ResourceNotFoundException {
		Optional<Employee> employee=Optional.empty();
		assertNotNull(employee);
		
	}
	
}
