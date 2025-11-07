package com.login.exemplo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.login.exemplo.dto.UsuarioRequestDTO;
import com.login.exemplo.dto.UsuarioResponseDTO;
import com.login.exemplo.entity.Usuario;
import com.login.exemplo.repositories.UsuarioRepository;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;

	@PostMapping(value = "Usuario/cadastro")
	public ResponseEntity<UsuarioResponseDTO> saveUser(@Valid @RequestBody UsuarioRequestDTO user) {
		Usuario usuario = new Usuario(user.getName(), user.getEmail(), user.getPassword());
		usuarioRepository.save(usuario);
		UsuarioResponseDTO response = new UsuarioResponseDTO(usuario);
	    return ResponseEntity.ok(response);

	}

	@PostMapping(value = "login")
	public ResponseEntity<?> login(Usuario user) {
		Usuario findUser = usuarioRepository.findByEmail(user.getEmail());
		if (findUser == null) {
			return ResponseEntity.ok("Usuario não encontrado");
		} else {
			if (findUser.getPassword() == user.getPassword()) {
				return ResponseEntity.ok("Logado com sucesso");
			} else {
				return ResponseEntity.ok("Senha incorreta");
			}
		}
	}
	
	@GetMapping(value = "listar/fiama")
	public List<UsuarioResponseDTO> listarUsuario1() {  
	    List<Usuario> usuarios = usuarioRepository.findAll();
	    List<UsuarioResponseDTO> listaDTO = usuarios.stream()
	        .map(u -> new UsuarioResponseDTO(u.getId(), u.getName(), u.getEmail()))
	        .toList();

	    return listaDTO;
	}

	@GetMapping(value = "Vitinho")
	public List<UsuarioResponseDTO> listarUsuario() {
	    return usuarioRepository.findAll()
	            .stream()
	            .map(usuario -> new UsuarioResponseDTO(
	                    usuario.getId(),
	                    usuario.getName(),
	                    usuario.getEmail()
	            ))
	            .toList();
	}
	@GetMapping(value = "{id}")
	public ResponseEntity<UsuarioResponseDTO> usuarioId(@PathVariable int id) {
		return usuarioRepository.findById(id)
		.map(usuario -> ResponseEntity.ok(new UsuarioResponseDTO(usuario)))
        .orElse(ResponseEntity.notFound().build());
	}
	
	@DeleteMapping(value = "{id}")
	public ResponseEntity<?> deletar(@PathVariable int id) {
		if(usuarioRepository.existsById(id)) {
			usuarioRepository.deleteById(id);
			//return ResponseEntity.noContent().build();//204
			return ResponseEntity.status(HttpStatus.OK).body("Excluido com sucesso");
		}else {
			//return ResponseEntity.notFound().build();//404
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Esse id não existe");
		}

	}
	@PutMapping(value = "Usuario/{id}")
	public ResponseEntity<UsuarioResponseDTO> atualizar(@PathVariable int id, @RequestBody UsuarioRequestDTO novo) {
	    Optional<Usuario> usuarioExistente = usuarioRepository.findById(id);
	    
	    if (usuarioExistente.isPresent()) {
	        Usuario usuario = usuarioExistente.get();
	        
	        usuario.setName(novo.getName());
	        usuario.setEmail(novo.getEmail());
	        usuario.setPassword(novo.getPassword());
	        
	        Usuario usuarioAtualizado = usuarioRepository.save(usuario);
	        
	        UsuarioResponseDTO response = new UsuarioResponseDTO(usuarioAtualizado);
	        return ResponseEntity.ok(response);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

	
	
	

}
