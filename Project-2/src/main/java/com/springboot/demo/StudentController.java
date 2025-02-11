package com.springboot.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
//http://localhost:8080/student
	
	@GetMapping("/student")
	public Student GetStudent() {
		return new Student("Navya","Sri");
	}
}
