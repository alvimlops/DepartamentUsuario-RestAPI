package com.alvimcode.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvimcode.userdept.entities.User;
import com.alvimcode.userdept.repositories.UserRepository;

//Classe contoladora
@RestController
@RequestMapping(value = "/users")
public class UserController {

	//anotação para enjeção de dependencia
	@Autowired
	private UserRepository repository;
	
	//Endpoint da aplicação para busca todos os usuarios
	@GetMapping
	public List<User> findAll(){
		List<User>result = repository.findAll();
		return result;
	}
}
