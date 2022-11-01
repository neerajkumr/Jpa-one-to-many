package com.spring.dto;

import com.spring.entity.Instructor;

public class InstructorRequest {

	private Instructor ins;

	public InstructorRequest() {
	}

	public InstructorRequest(Instructor ins) {
		super();
		this.ins = ins;
	}

	public Instructor getIns() {
		return ins;
	}

	public void setIns(Instructor ins) {
		this.ins = ins;
	}

}
