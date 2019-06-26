package com.example.h2databasedemo.services;

import com.example.h2databasedemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeService extends JpaRepository<Employee, Integer> {
}
