package com.mysql.todolist.controller;


//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.todolist.entity.Usuario;
import com.mysql.todolist.repositories.UsuarioRepositoty;

@RestController //classe responsavel por mostrar
public class UsuarioController {
	
	@Autowired
	UsuarioRepositoty user;
	

	
	@PostMapping
	public Usuario salvar() {
		
		Usuario Ryan = new Usuario("Ryan", "ry90an@gmail.com", "123456");
		return user.save(Ryan);
	
	}
	/*@GetMapping
	public List<Usuario> mostrar() {
		List<Usuario> usuario = user.findAll();
		return usuario;
	}*/
	

}
