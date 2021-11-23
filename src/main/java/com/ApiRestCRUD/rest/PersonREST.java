package com.ApiRestCRUD.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiRestCRUD.dao.personDAO;
import com.ApiRestCRUD.model.Person;

@RestController
@RequestMapping("person")
public class PersonREST {
	
	@Autowired
	private personDAO personDao;
	
	//solicitud al servidor con metodos jpa y hibernate
	
	@PostMapping("/save")
	public void savePerson(@RequestBody Person person) { //requestbody transforma json a object
		
		personDao.save(person);
	}
	
	@GetMapping("/list")
	public List<Person> personList(){
		
		return personDao.findAll();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletePerson(@PathVariable ("id") Integer id) {
		personDao.deleteById(id);
	}
	
	@PutMapping("/update")
	public void updatePerson(@RequestBody Person person) {
		personDao.save(person);		
	}

}
