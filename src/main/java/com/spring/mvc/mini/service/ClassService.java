package com.spring.mvc.mini.service;

import com.spring.mvc.mini.model.ClassTaken;
import com.spring.mvc.mini.model.Student;

import java.util.List;

public interface ClassService {


//	public void addStudent(Student p);
//	public void updateStudent(Student p);
	public List<ClassTaken> getClassByStudentId();
	public Student getStudentById(int id);
	public void removeStudent(int id);
	
}
