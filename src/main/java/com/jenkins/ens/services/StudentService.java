package com.jenkins.ens.services;


import com.jenkins.ens.entities.Student;
import com.jenkins.ens.repo.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private StudentRepository repository;

    public List<Student> getAll(){
        return repository.findAll();
    }
}
