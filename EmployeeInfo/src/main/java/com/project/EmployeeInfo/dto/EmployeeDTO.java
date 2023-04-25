package com.project.EmployeeInfo.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.project.EmployeeInfo.entity.Employee;

public class EmployeeDTO {
    private Long id;
    private String name;
    private LocalDate dateOfBirth;

    public EmployeeDTO(Long id, String name, LocalDate dateOfBirth) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public EmployeeDTO() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
    
    public static EmployeeDTO fromEntity(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setName(employee.getName());
        employeeDTO.setDateOfBirth(employee.getDateOfBirth());
        return employeeDTO;
    }

    public static List<EmployeeDTO> fromEntityList(List<Employee> employees) {
        return employees.stream().map(EmployeeDTO::fromEntity).collect(Collectors.toList());
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
