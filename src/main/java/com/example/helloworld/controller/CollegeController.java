package com.example.helloworld.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.models.College;
import com.example.helloworld.models.Student;
import com.example.helloworld.service.CollegeService;

@RestController
public class CollegeController {


//	//REST --> HTTP -->(Website)--> HTTP Methods - GET , POST, PUT, DELETE
//	@GetMapping("hello")
//	public String hello() {
//		System.out.println("Enetered the hello method");
//		return "Hello from Java Springboot";
//	}

	@GetMapping("getStudent")
	public Student getStudent() {
		CollegeService collegeService = new CollegeService();
		return collegeService.createStudent();
	}

	@GetMapping("getStudentsList")
	public List<Student> getStudentsList() {
		CollegeService collegeService = new CollegeService();
		return collegeService.createStudents();
	}

	@GetMapping("getCollege")
	public College getCollege() {
		CollegeService collegeService = new CollegeService();
		return collegeService.getCollege();
	}

	//GET
	// Request Parameter
	@GetMapping("receiveId")
	public Student receiveId(@RequestParam int id, @RequestParam(required = false) String name) {
		System.out.println("Received ID:"+id);
		System.out.println("Received Name:"+name);
		CollegeService collegeService = new CollegeService();
		List<Student> list =  collegeService.createStudents();
		for(Student s: list) {
			if(s.getId()==id) {
				return s;
			}
		}
		return null;
	}

	// Path Variable
	@GetMapping("receiveId/{id}/{name}")
	public String receiveIdPath(@PathVariable int id, @PathVariable String name) {
		System.out.println("Received Path Variable ID:"+id);
		System.out.println("Received Path Variable Name:"+name);
		return "Success";
	}

//	//Converts JAVA objevts to JSON -  JavaScript Object Notation, Jackson
//	@GetMapping("getStudent")
//	public Student getStudent() {
//		System.out.println("Enetered the getStudent method");
//		Student student = new Student(1, "Chetan");
//		return student;
//	}
//	
//	@GetMapping("bye")
//	public String bye() {
//		System.out.println("Enetered the Bye method");
//		return "Bye from Java Springboot";
//	}
}
