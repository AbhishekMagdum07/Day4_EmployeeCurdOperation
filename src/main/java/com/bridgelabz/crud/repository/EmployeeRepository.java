package com.bridgelabz.crud.repository;

import com.bridgelabz.crud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    /**
     * Transferring the queries from JpaRepository.
     * @param name
     * @return
     */
    public Employee findByName(String name);
}
