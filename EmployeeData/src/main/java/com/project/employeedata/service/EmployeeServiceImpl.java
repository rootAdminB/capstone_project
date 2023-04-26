package com.project.employeedata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.employeedata.entity.Employee;
import com.project.employeedata.exception.InValidEmployeeIDException;
import com.project.employeedata.repository.EmployeeRepository;
import com.project.employeedata.vo.EmployeeVO;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeVO getEmployeeById(long employeeID) throws InValidEmployeeIDException {
		Employee employee = employeeRepository.findById(employeeID).orElseThrow(
				() -> new InValidEmployeeIDException("Invalid EmployeeId : " + employeeID));
		EmployeeVO employeeVO = new EmployeeVO(employee.getEmployeeID(), employee.getEmployeeName(), employee.getDateOfBirth());
		return employeeVO;
	}
	

}
