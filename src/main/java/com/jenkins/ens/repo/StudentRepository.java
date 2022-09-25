package com.jenkins.ens.repo;

import com.jenkins.ens.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
