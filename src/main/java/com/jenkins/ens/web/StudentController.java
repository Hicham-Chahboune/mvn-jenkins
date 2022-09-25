package com.jenkins.ens.web;


import com.jenkins.ens.entities.Student;
import com.jenkins.ens.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {


    private StudentService studentService;

    @GetMapping
    public List<Student> getAll(){
        return studentService.getAll();
    }
}
