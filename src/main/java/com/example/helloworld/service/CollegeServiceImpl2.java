package com.example.helloworld.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.helloworld.models.College;
import com.example.helloworld.models.Student;

@Component  //@Service, @Repository
public class CollegeServiceImpl2  implements ICollegeService {

	public Student createStudent() {
		Student student = new Student(11, "Chitra");
		return student;
	}
	
	public College getCollege() {
		College college = new College("VVEC", createStudents());
		return college;
	}

	public List<Student> createStudents() {
		Student student1 = new Student(1, "Chetan1");
		Student student2 = new Student(2, "Chetan2");
		Student student3 = new Student(3, "Chetan3");
		Student student4 = new Student(4, "Chetan4");
		Student student5 = new Student(5, "Chetan5");
		List<Student> students = new ArrayList<Student>(); // Liskov Substution priciple
		students.add(student1);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		return students;
	}



}
