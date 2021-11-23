package com.ApiRestCRUD.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiRestCRUD.model.Person;

public interface personDAO extends JpaRepository<Person , Integer >{

}
