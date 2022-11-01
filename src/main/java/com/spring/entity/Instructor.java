package com.spring.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "instructor")
public class Instructor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ins_id;

	@Column(name = "first_name", length = 20)
	private String firstName;

	@Column(name = "last_name", length = 20)
	private String lastName;

	@Column(name = "email_id", length = 25)
	private String email;

	@OneToMany(mappedBy = "instructor", targetEntity = Course.class, cascade = CascadeType.ALL)
	private List<Course> course;

	public Instructor() {

	}

	public Instructor(int ins_id, String firstName, String lastName, String email, List<Course> course) {
		super();
		this.ins_id = ins_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.course = course;
	}

	public int getIns_id() {
		return ins_id;
	}

	public void setIns_id(int ins_id) {
		this.ins_id = ins_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Instructor [ins_id=" + ins_id + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", course=" + course + "]";
	}

}
