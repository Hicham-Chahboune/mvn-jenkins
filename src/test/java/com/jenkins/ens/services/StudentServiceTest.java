package com.jenkins.ens.services;

import com.jenkins.ens.entities.Student;
import com.jenkins.ens.repo.StudentRepository;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
class StudentServiceTest {

    @Mock
    StudentRepository studentRepository;

    @InjectMocks
    StudentService studentService;



    @Test
    void getAll() {

        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student(null,"hicham","chahboune");
        Student student3 = new Student(null,"med","chahboune");
        Student student2 = new Student(null,"ahmed","chahboune");

        students.add(student1);
        students.add(student2);
        students.add(student3);

        when(studentRepository.findAll()).thenReturn(students);

        assertEquals(students,studentService.getAll());
    }
}