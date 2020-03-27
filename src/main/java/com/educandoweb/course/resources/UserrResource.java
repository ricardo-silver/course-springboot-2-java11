package com.educandoweb.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserrResource {
	
	@GetMapping
	public ResponseEntity<User> FindAll() {
		User u = new User (1l, "Maria","maria@gmail.com.br","999999","12345");
		return ResponseEntity.ok().body(u);
	}
}
