package com.chhaileng.sr.repository;

import java.util.List;

import com.chhaileng.sr.model.Person;

public interface PersonRepository {
	void add(Person p);
	List<Person> findAll();
}
