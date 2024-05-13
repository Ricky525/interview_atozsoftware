package ricky.interview.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ricky.interview.employeemanagementsystem.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}