package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepo;

@RestController
public class StudentController {

	@Autowired
	private StudentRepo repo;
	
	@GetMapping("/")
	public String show()
	{
		return "Welcome";
	}
	@PostMapping("/student")
	public Student put(@RequestBody Student student)
	{
		return repo.save(student);
	}
	@GetMapping("/student")
	public List<Student> give()
	{
		return repo.findAll();
	}
	@GetMapping("/student/{id}")
	public Student givele(@PathVariable int id)
	{
		return repo.findById(id).orElse(null);
	}
	@DeleteMapping("/student/{id}")
	public String deletele(@PathVariable int id)
	{
		repo.deleteById(id);
		return "Deleted";
	}
	
}