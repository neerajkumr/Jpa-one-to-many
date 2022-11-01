package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.entity.Course;
import com.spring.repository.CourseRepository;
import com.spring.repository.InstructorRepository;

@Service
public class CourseService {
	@Autowired
	private CourseRepository crep;

	@Autowired
	private InstructorRepository irep;

	public Optional<Object> save(int id, final Course cs) throws Exception {
		return irep.findById(id).map(instructor -> {
			cs.setInstructor(instructor);
			crep.save(cs);
			return crep.findAll();
		});
	}

	public List<Course> getAll() {
		new ResponseEntity<Course>(HttpStatus.OK).getBody();
		return crep.findAll();
	}

	public Course getByID(int id) {
		if (crep.findAll() != null) {
			new ResponseEntity<Course>(HttpStatus.OK).getBody();
			return crep.findById(id).get();
		} else {
			new ResponseEntity<Course>(HttpStatus.BAD_GATEWAY);
		}
		return null;
	}

	public Optional<Object> update(int ins_id, int id, Course cs) {
		if (!irep.existsById(ins_id)) {
			return null;
		} else {
			return crep.findById(id).map(course -> {
				cs.setCoruseName(cs.getCoruseName());
				return crep.save(cs);

			});
		}

	}
}
