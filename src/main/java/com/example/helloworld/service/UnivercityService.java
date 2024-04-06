package com.example.helloworld.service;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.helloworld.models.College;
import com.example.helloworld.models.Student;

@Primary
//@Component
@Service //@Repository
public class UnivercityService implements ICollegeService {

	@Override
	public Student createStudent() {
		// TODO Auto-generated method stub
		return new Student(9999, "University Student");
	}

	@Override
	public College getCollege() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> createStudents() {
		// TODO Auto-generated method stub
		return null;
	}

}
