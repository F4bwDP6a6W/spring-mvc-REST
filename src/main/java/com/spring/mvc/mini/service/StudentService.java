package com.spring.mvc.mini.service;

import com.spring.mvc.mini.model.Student;

import java.util.List;

public interface StudentService {

	public void addStudent(Student p);
	public void updateStudent(Student p);
	public List<Student> listStudents();
	public Student getStudentById(int id);
	public void removeStudent(int id);
	
}
