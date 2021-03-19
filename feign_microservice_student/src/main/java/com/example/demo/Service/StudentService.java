package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;

@Service
public interface StudentService {

	public List<Student> getAllStudents();

	public Student createStudent(Student student);
}
