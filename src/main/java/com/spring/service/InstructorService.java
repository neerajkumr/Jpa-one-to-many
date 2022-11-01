package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dto.InstructorRequest;
import com.spring.dto.JoinInfoResponce;
import com.spring.entity.Instructor;
import com.spring.repository.InstructorRepository;

@Service
public class InstructorService {
	@Autowired
	private InstructorRepository irep;

	public List<Instructor> display() {
		return irep.findAll();
	}

	public Instructor insert(InstructorRequest req) {
		return irep.save(req.getIns());
	}

	public Instructor partialUpdate(int id, String lastName) {
		Instructor ins = irep.findById(id).get();
		if (ins != null) {
			ins.setLastName(lastName);
			return irep.save(ins);
		} else {
			return null;
		}
	}

	public Instructor getById(int id) {
		return irep.findById(id).get();
	}

	public List<Instructor> deleteById(int id) {
		if (irep.findAll() != null) {
			irep.deleteById(id);
			return irep.findAll();
		} else {
			return null;
		}
	}

	public List<JoinInfoResponce> getJoinInfo() {
		return irep.getData();
	}
}
