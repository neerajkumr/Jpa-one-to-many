package com.spring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.Course;
import com.spring.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	@Autowired
	private CourseService cservice;

	@PostMapping("/{ins_id}/courses")
	public Optional<Object> save(@PathVariable int ins_id, @RequestBody Course cs) throws Exception {
		return cservice.save(ins_id, cs);
	}

	@GetMapping
	public List<Course> getAll() {
		return cservice.getAll();
	}

	@GetMapping("/{id}")
	public Course getByID(@PathVariable int id) {
		new ResponseEntity<Course>(HttpStatus.OK).getBody();
		return cservice.getByID(id);
	}

	@PutMapping("/update/{ins_id}/{id}")
	public Optional<Object> update(@PathVariable int ins_id,@PathVariable int id, @RequestBody Course cs) {
		return cservice.update(ins_id,id, cs);
	}
}
