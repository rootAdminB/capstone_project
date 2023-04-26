package com.project.employeedata.service;

import com.project.employeedata.exception.InValidEmployeeIDException;

import com.project.employeedata.vo.EmployeeVO;

public interface EmployeeService {

	public EmployeeVO getEmployeeById(long employeeID) throws InValidEmployeeIDException;

}
