package com.bridgelabz.crud.controller;

import com.bridgelabz.crud.entity.Employee;
import com.bridgelabz.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * In this method Adding Employee details to the database using postmapping.
     * @param employee
     * @return employee details from database.
     */
    @PostMapping("/post")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    /**
     * In this method Retrieve Employee details from the database using getmapping.
     * @return all employee details.
     */
    @GetMapping("/get")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    /**
     *In this method Retrieve Employee details with respect to id from the database using getmapping.
     * @param id
     * @return employee details with respect to id.
     */
    @GetMapping("/get/{id}")
    public Employee getByID(@PathVariable Long id) {
        return employeeService.getByID(id);
    }

    /**
     * In this method Retrieve Employee details from the database using getmapping.
     * @param name
     * @return employee details with respect to name.
     */
    @GetMapping("/getByName/{name}")
    public Employee getByName(@PathVariable String name) {
        return employeeService.getByName(name);
    }

    /**
     *In this method Deleting Employee details from the database using Deletemapping.
     * @param id
     * @return Complete message after deleting the employee details with respect to id.
     */
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "Employee is Deleted Successfully";
    }

    /**
     *In this method Updating Employee details using putmapping.
     * @param id
     * @param employee
     * @return the new employee details to update.
     */
    @PutMapping("/put/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

}

