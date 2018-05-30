package com.chhaileng.sr.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.chhaileng.sr.model.Person;

@Repository
public class PersonRepositoryImpl implements PersonRepository {

	private List<Person> people = new ArrayList<>();
	
	@Override
	public void add(Person p) {
		people.add(p);
	}

	@Override
	public List<Person> findAll() {
		return people;
	}
	
}
