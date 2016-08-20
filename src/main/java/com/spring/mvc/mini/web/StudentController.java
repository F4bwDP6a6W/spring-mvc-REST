package com.spring.mvc.mini.web;

import com.spring.mvc.mini.model.ClassTaken;
import com.spring.mvc.mini.model.Student;
import com.spring.mvc.mini.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller()
public class StudentController {

	private StudentService studentService;

	@Autowired(required=true)
	@Qualifier(value="studentService")
	public void setStudentService(StudentService ss){
		studentService = ss;
	}
	
	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public @ResponseBody List getStudentsInJSON() {

		return studentService.listStudents();
	}

	@RequestMapping(value = "/students/{studentId}", method = RequestMethod.GET)
	public @ResponseBody Student getStudentById(@PathVariable() Integer studentId) {

		System.out.println(studentId);
		return studentService.getStudentById(studentId);
	}

	@RequestMapping(value= "/student", method = RequestMethod.POST)
	public @ResponseBody String save(@RequestBody Student jsonString) {

		if(jsonString.getId() == 0){
			//new student, add it
			studentService.addStudent(jsonString);
		}
		return "Your request are submitted.";
	}

	@RequestMapping(value= "/student/{studentId}", method = RequestMethod.PUT)
	public @ResponseBody String update(@PathVariable() Integer studentId, @RequestBody Student jsonString) {
		Student s = studentService.getStudentById(studentId);
		if(jsonString.getBirthday() != null) s.setBirthday(jsonString.getBirthday());
		if(jsonString.getDepartment() != null) s.setDepartment(jsonString.getDepartment());
		if(jsonString.getFirstName() != null) s.setFirstName(jsonString.getFirstName());
		if(jsonString.getGender() != null) s.setGender(jsonString.getGender());
		if(jsonString.getGpa() != null) s.setGpa (jsonString.getGpa());
		if(jsonString.getLastName() != null) s.setLastName(jsonString.getLastName());
		if(jsonString.getMentorId() != null) s.setMentorId(jsonString.getMentorId());
		if(jsonString.getUscId() != null) s.setUscId(jsonString.getUscId());
		studentService.updateStudent(s);
		return "updated";
	}

	@RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public @ResponseBody String removeStudent(@PathVariable("id") int id){
		
        studentService.removeStudent(id);
        return "removed";
    }

	@RequestMapping(value= "/class", method = RequestMethod.POST)
	public @ResponseBody String enroll(@RequestBody ClassTaken jsonString) {

		return "";
	}

}
