package com.chhaileng.sr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chhaileng.sr.model.Person;
import com.chhaileng.sr.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService {

	private PersonRepository personRepository;
	
	@Autowired
	public void setPersonRepository(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@Override
	public void add(Person p) {
		personRepository.add(p);
	}

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}
	
	@Override
	public void showPerson() {
		personRepository.findAll().forEach(System.out::println);
	}
	
}
