package kp.kfpricefs.ems.repository;

import kp.kfpricefs.ems.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
