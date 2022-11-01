package com.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.dto.JoinInfoResponce;
import com.spring.entity.Instructor;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer> {
	
	@Query("select new com.spring.dto.JoinInfoResponce(i.email , c.coruseName) from Instructor i join i.course c")
	public List<JoinInfoResponce> getData();

}
