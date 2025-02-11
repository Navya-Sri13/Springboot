package com.springboot.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
    //http://localhost:8080/student
	
	@GetMapping("/student")
	public Student GetStudent() {
		return new Student("Navya","Sri");
	}
	//http://localhost:8080/students
	@GetMapping("/students")
	public List<Student> GetStudents(){
		
		List<Student> Students=new ArrayList();
		Students.add(new Student("Navya","Sri"));
		Students.add(new Student("Kavya","Sri"));
		Students.add(new Student("Bhavya","Sri"));
	    return Students;
	}
	
	//http://localhost:8080/firstname/lastname
	//http://localhost:8080/student/firstname/lastname if @GetMapping("/Student/{firstname}/{lastname}")
	@GetMapping("{firstname}/{lastname}")
	public Student StudentPathVariable(@PathVariable("firstname") String firstname,
			@PathVariable("lastname") String lastname)
	{
	return new Student(firstname,lastname);	
	}
}
