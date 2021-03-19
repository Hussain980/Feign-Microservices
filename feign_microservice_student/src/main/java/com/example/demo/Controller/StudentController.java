package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.Service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService stdService;

	@GetMapping("/get")
	public List<Student> getAllStudents() {
		return stdService.getAllStudents();
	}
	
	@PostMapping("/save")
	public Student create(@RequestBody Student student) {
	  return stdService.createStudent(student);
	}
}
