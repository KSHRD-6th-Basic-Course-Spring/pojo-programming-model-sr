package com.chhaileng.sr.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chhaileng.sr.model.Person;
import com.chhaileng.sr.service.PersonService;

@Controller
public class HomeController {

	private PersonService personService;
	
	@Autowired
	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	@GetMapping("/add")
	public String index(@RequestParam String name, @RequestParam String gender, @RequestParam int age) {
		
		Person p = new Person(personService.findAll().size() + 1, name, gender, age);
		System.out.println("Add obj : " + p);
		personService.add(p);
		
		return "index";
	}
	
	@GetMapping("/find")
	public String find() {
		
		personService.showPerson();
		
		return "index";
	}
	
}
