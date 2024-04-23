package kp.kfpricefs.ems.repository;

import kp.kfpricefs.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
