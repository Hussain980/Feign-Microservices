package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Result;
import com.example.demo.Service.ResultService;

@RestController
@RequestMapping("/result")
public class ResultController {

	
	@Autowired
	ResultService resultService;

	@GetMapping("/get")
	public List<Result> getAllResults() {
		return resultService.getAllResults();
	}
	
	@PostMapping("/save")
	public Result createResult(@RequestBody Result result) {
	  return resultService.createResult(result);
	}
}
