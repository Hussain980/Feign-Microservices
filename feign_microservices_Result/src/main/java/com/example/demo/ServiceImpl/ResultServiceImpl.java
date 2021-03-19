package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Result;
import com.example.demo.Repository.ResultRepository;
import com.example.demo.Service.ResultService;


@Service
public class ResultServiceImpl implements ResultService{
	
	@Autowired
	ResultRepository resultRepo;
	
	@Override
	public Result createResult(Result result) {
		return resultRepo.save(result);
	}

	@Override
	public List<Result> getAllResults() {
		return resultRepo.findAll();
	}

}
