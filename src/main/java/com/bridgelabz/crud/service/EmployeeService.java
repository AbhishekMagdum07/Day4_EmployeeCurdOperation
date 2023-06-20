package com.bridgelabz.crud.service;

import com.bridgelabz.crud.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(Employee Employee);

    List<Employee> getAllEmployees();

    Employee getByID(Long id);

    Employee updateEmployee(Long id, Employee Employee);

    void deleteEmployee(Long id);

    Employee getByName(String name);
}


   




