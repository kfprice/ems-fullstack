package com.kfpricefs.ems.repository;

import com.kfpricefs.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
