package com.chhaileng.sr.service;

import java.util.List;

import com.chhaileng.sr.model.Person;

public interface PersonService {
	void add(Person p);
	List<Person> findAll();
	void showPerson();
}
