package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.Service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepository stdRepo;
	
	@Override
	public List<Student> getAllStudents() {
		return stdRepo.findAll();
	}

	@Override
	public Student createStudent(Student student) {
		return stdRepo.save(student);
	}

}

