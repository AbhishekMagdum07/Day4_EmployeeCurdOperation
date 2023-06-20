package com.bridgelabz.crud.service;

import com.bridgelabz.crud.entity.Employee;
import com.bridgelabz.crud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    /**
     * Applying Business logics according to requirement.
     */
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee getByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee db = employeeRepository.findById(id).get();
        db.setName(employee.getName());
        db.setSalary(employee.getSalary());
        return employeeRepository.save(db);
    }

    @Override
    public Employee getByID(Long id) {
        return employeeRepository.findById(id).get();
    }
}
