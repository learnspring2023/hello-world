package com.example.helloworld.service;

import java.util.List;

import com.example.helloworld.models.College;
import com.example.helloworld.models.Student;

public interface ICollegeService {
	public Student createStudent();
	public College getCollege();
	public List<Student> createStudents();
}
