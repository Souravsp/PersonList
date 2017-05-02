package com.mantra.spring.service;

import com.mantra.spring.model.Person;

import java.util.List;

public interface PersonService {

	public void addPerson(Person p);
	public void updatePerson(Person p);
	public List<Person> listPersons();
	public Person getPersonById(int id);
	public void removePerson(int id);
	
}
