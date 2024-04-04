package com.example.helloworld.models;

import java.util.List;

public class College {
	String collageName;
	List<Student> students;
	
	public College(String collageName, List<Student> students) {
		super();
		this.collageName = collageName;
		this.students = students;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	

}
