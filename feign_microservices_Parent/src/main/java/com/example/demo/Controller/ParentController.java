package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Feign_Client.ResultInterface;
import com.example.demo.Feign_Client.StudentInterface;
import com.example.demo.Model.Result;
import com.example.demo.Model.Student;

@RestController
@RequestMapping("/parent")
public class ParentController {

	@Autowired
	ResultInterface resultInter;
	
	@Autowired
	StudentInterface studentInter;

	@GetMapping("/studentGet")
	public List<Student> getAllStudents() {
		return studentInter.getAllStudents();
	}
	
	@PostMapping("/studentSave")
	public Student create(@RequestBody Student student) {
	  return studentInter.createStudent(student);
	}
	
	@GetMapping("/resultGet")
	public List<Result> getAllResults() {
		return resultInter.getAllResults();
	}
	
	@PostMapping("/resultSave")
	public Result createResult(@RequestBody Result result) {
	  return resultInter.createResult(result);
	}
}
