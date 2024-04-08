package com.example.helloworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.models.Student;
import com.example.helloworld.service.ICollegeService;
import com.example.helloworld.service.UtilityService;

@RestController
public class PostController {

	@Autowired
	@Qualifier(value = "univercityService")
	ICollegeService collegeService;
	
	@Autowired
	UtilityService utilityService;
	
	@PostMapping("add-student")
	public String addStudent(@RequestBody Student student) {
		collegeService.createStudents();
		System.out.println(student);
		System.out.println(utilityService.totalFee());
		return "Added to Database Successfully";
	}
	
	@PostMapping("add-student-list")
	public String addStudent(@RequestBody List<Student> students) {
		System.out.println(students);
		return "Added to Database Successfully";
	}
	
	@PutMapping("update-student-list")
	public String updateStudent(@RequestBody List<Student> students) {
		System.out.println(students);
		return "Added to Database Successfully";
	}
	
	@DeleteMapping("delete-student/{id}")
	public String updateStudent(@PathVariable int id) {
		System.out.println("Deleting student with id:"+id);
		return "Delete Successfully";
	}
	
}
