package com.project.EmployeeInfo.entity;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeeID")
    private Long id;

    @Column(name = "employeeName")
    private String name;

    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;

    public Employee() {
    }

    public Employee(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
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

}
