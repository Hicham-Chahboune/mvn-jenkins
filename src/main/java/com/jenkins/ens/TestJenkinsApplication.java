package com.jenkins.ens;

import com.jenkins.ens.entities.Student;
import com.jenkins.ens.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestJenkinsApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Student student1 = new Student(null,"hicham","chahboune");
        Student student3 = new Student(null,"med","chahboune");
        Student student2 = new Student(null,"ahmed","chahboune");

        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);

    }
}
