package com.sjprogramming.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sjprogramming.api.Repository.StudentRepository;
import com.sjprogramming.api.entity.Student;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository repo;
	
	// TO GET ALL students
		//localhost:8080/Student
		
	@GetMapping("/student")
	public List<Student> getAllStudents()
	{
		List<Student>students= repo.findAll();
		return students;
	}
	
	
	////localhost:8080/student/1
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable int id)
	{
	
	Student student = repo.findById(id).get();
	
	return student;
	}
	
	//localhost:8080/student add
	@PostMapping("/student/add")
	@ResponseStatus(code=HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student)
	{
		repo.save(student);
	}

	
	@PutMapping("/student/update/{id}")
	public Student updateStudent(@PathVariable int id)
	{
		Student student = repo.findById(id).get();
		student.setName("spraygod");
		student.setPercentage(99);
		repo.save(student);
		
		return student;
	}
	
	@DeleteMapping("/student/delete/{id}")
	public void removeStudent(@PathVariable int id)
	{
		Student student = repo.findById(id).get();
		repo.delete(student);
	}
}
