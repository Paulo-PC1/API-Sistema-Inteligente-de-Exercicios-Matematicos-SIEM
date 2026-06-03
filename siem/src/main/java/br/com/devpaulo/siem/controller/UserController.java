package br.com.devpaulo.siem.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devpaulo.siem.domain.model.User;

@RestController
public class UserController {
	
	@GetMapping("/users")
	public List<User> listUsers(){
		var user1 = new User();
		user1.setId(1L);
		user1.setName("Fernando Duarte");
		user1.setEmail("fernandoduarte@ifsp.edu.br");
		user1.setPassword("cjoweb3");
		user1.setActive(true);
		
		var user2 = new User();
		user2.setId(2L);
		user2.setName("Adriana Santos");
		user2.setEmail("adrianasantos@ifsp.edu.br");
		user2.setPassword("adriana");
		user2.setActive(true);
		
		return Arrays.asList(user1, user2);	
	}
}
