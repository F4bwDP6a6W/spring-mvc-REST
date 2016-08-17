package com.spring.mvc.mini.service;

import com.spring.mvc.mini.model.Person;

import java.util.List;

public interface PersonService {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
	
}
