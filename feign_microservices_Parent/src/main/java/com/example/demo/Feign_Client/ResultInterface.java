package com.example.demo.Feign_Client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Model.Result;

//@FeignClient(url ="http://localhost:9092/result" , value="ResultService")
@FeignClient(name = "http://RESULT-SERVICE/result")
public interface ResultInterface {

	@GetMapping("/get")
	List<Result> getAllResults();

	@PostMapping("/save")
	Result createResult(Result result);
	
}
