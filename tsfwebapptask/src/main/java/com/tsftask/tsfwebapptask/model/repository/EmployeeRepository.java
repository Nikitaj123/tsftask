package com.tsftask.tsfwebapptask.model.repository;

import com.tsftask.tsfwebapptask.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
