package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.InstructorRequest;
import com.spring.dto.JoinInfoResponce;
import com.spring.entity.Instructor;
import com.spring.service.InstructorService;

@RestController
@RequestMapping("/instructor")
public class InstructorController {
	@Autowired
	private InstructorService service;

	@GetMapping("/all")
	public List<Instructor> getAllList() { 
		return service.display();
	}

	@PostMapping("/sendData")
	public Instructor input(@RequestBody InstructorRequest req) {
		return service.insert(req);
	}

	@PatchMapping("/{id}/{lastName}")
	public Instructor patchLastName(@PathVariable int id, @PathVariable String lastName) {
		return service.partialUpdate(id, lastName);
	}

	@GetMapping("/{id}")
	public Instructor getWithId(@PathVariable int id) {
		return service.getById(id);
	}

	@GetMapping("/delete/{id}")
	public List<Instructor> delCourses(@PathVariable int id) {
		return service.deleteById(id);

	}
	
	@GetMapping("/joinInfo")
	public List<JoinInfoResponce> getJoinInfo() {
		return service.getJoinInfo();
	}
}
