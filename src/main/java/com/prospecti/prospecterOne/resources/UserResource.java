package com.prospecti.prospecterOne.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.prospecti.prospecterOne.entities.User;
import com.prospecti.prospecterOne.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {//Controlador rest

//	@GetMapping
//	public ResponseEntity<User> findALL(){
//		User u = new User(1L, "Maria", "maria@gmail.com", "99999999", "12345");
//		return ResponseEntity.ok().body(u);
//	}
	
	@Autowired // só pode injetar o que for componente do spring
	           // uma classe criada pelo programador pode ser componente
			   // com as anotações @Component, @Repository, @Service
	private UserService service; // a classe UserService deve receber uma anotação de componente
	
	@GetMapping
	public ResponseEntity<List<User>> findALL(){
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
