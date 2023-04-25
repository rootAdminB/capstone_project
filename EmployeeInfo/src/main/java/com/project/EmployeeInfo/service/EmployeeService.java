package com.project.EmployeeInfo.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.EmployeeInfo.dto.EmployeeDTO;
import com.project.EmployeeInfo.entity.Employee;
import com.project.EmployeeInfo.exception.EmployeeNotFoundException;
import com.project.EmployeeInfo.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<EmployeeDTO> getAllEmployees() {
        logger.info("Retrieving all employees");
        List<Employee> employees = employeeRepository.findAll();
        return EmployeeDTO.fromEntityList(employees);
    }

    public EmployeeDTO getEmployeeById(Long id) {
        logger.info("Retrieving employee with id {}", id);
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
        return EmployeeDTO.fromEntity(employee);
    }
}

