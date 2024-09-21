package com.prospecti.prospecterOne.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.prospecti.prospecterOne.entities.Order;
import com.prospecti.prospecterOne.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {//Controlador rest

//	@GetMapping
//	public ResponseEntity<Order> findALL(){
//		Order u = new Order(1L, "Maria", "maria@gmail.com", "99999999", "12345");
//		return ResponseEntity.ok().body(u);
//	}
	
	@Autowired // só pode injetar o que for componente do spring
	           // uma classe criada pelo programador pode ser componente
			   // com as anotações @Component, @Repository, @Service
	private OrderService service; // a classe OrderService deve receber uma anotação de componente
	
	@GetMapping
	public ResponseEntity<List<Order>> findALL(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
