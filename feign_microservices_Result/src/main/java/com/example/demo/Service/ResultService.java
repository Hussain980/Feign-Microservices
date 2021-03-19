package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Entity.Result;

@Service
public interface ResultService {

	public Result createResult(Result result);

	public List<Result> getAllResults();
}
