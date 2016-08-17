package com.spring.mvc.mini.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Jerry
 *
 */
@Entity
@Table(name="STUDENT")
public class Student {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String firstName;
	private String lastName;
	private String gender;
	private Date birthday;
	private String uscId;
	private Float gpa;
	private Integer mentorId;
	private String department;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getUscId() {
		return uscId;
	}

	public void setUscId(String uscId) {
		this.uscId = uscId;
	}

	public Integer getMentorId() {
		return mentorId;
	}

	public void setMentorId(Integer mentorId) {
		this.mentorId = mentorId;
	}

	public Float getGpa() {
		return gpa;
	}

	public void setGpa(Float gpa) {
		this.gpa = gpa;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", gender='" + gender + '\'' +
				", birthday=" + birthday +
				", uscId='" + uscId + '\'' +
				", gpa=" + gpa +
				", mentorId=" + mentorId +
				", department='" + department + '\'' +
				'}';
	}
}
