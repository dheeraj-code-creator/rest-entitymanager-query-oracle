package com.rest.jpa.oracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.jpa.oracle.entity.Demo;
import com.rest.jpa.oracle.service.DemoService;



@RestController
@RequestMapping(value = "/details")
public class DemoController {

	@Autowired
	private DemoService demoService;
	
	@GetMapping(value = "/rangeDetails/{fromSalary}/{toSalary}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Demo> getRangeDetails(
			@PathVariable("fromSalary") int fromSalary,
			@PathVariable("toSalary") int toSalary){
		return demoService.getSalaryDetailsForUsers(fromSalary, toSalary);
	}
	
	@GetMapping(value = "/allUserDetails", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Demo> getAllDetails(){
		return demoService.getAllDetailsForUsers();
	}
	
	@GetMapping(value = "/userDetails/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Demo> getDetailsById(@PathVariable("id") int id) {
		return demoService.getUserDetailsById(id);
	}

}

