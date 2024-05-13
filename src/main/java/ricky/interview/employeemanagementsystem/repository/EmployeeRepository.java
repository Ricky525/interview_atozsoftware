package ricky.interview.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ricky.interview.employeemanagementsystem.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}