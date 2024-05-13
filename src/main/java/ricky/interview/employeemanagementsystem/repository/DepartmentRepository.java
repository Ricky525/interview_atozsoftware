package ricky.interview.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ricky.interview.employeemanagementsystem.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}