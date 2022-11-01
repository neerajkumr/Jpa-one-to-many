package com.spring.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "course")
public class Course {
	@Id
	private int c_id;

	@Column(name = "c_name", length = 20)
	private String coruseName;

	@ManyToOne(targetEntity = Instructor.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "ins_id", referencedColumnName = "ins_id")
	@JsonIgnore
	private Instructor instructor;

	public Course() {

	}

	public Course(int c_id, String coruseName, Instructor instructor) {
		super();
		this.c_id = c_id;
		this.coruseName = coruseName;
		this.instructor = instructor;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getCoruseName() {
		return coruseName;
	}

	public void setCoruseName(String coruseName) {
		this.coruseName = coruseName;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Course [c_id=" + c_id + ", coruseName=" + coruseName + ", instructor=" + instructor + "]";
	}

}
