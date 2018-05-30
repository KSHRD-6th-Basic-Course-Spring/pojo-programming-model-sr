package com.chhaileng.sr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chhaileng.sr.model.Person;
import com.chhaileng.sr.service.PersonService;

@RestController
public class TestRestController {
	
	@Autowired
	private PersonService p;
	
	@GetMapping("/rest/find")
	public List<Person> findAll() {
		return p.findAll();
	}
	
}
