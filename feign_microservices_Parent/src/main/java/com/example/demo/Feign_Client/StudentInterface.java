package com.example.demo.Feign_Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.Student;

//@FeignClient(url ="http://localhost:9091/student" , value="StudentService")
@FeignClient(name = "http://STUDENT-SERVICE/student")
public interface StudentInterface {

	@GetMapping("/get")
	List<Student> getAllStudents();

	@PostMapping("/save")
	Student createStudent(Student student);

}
