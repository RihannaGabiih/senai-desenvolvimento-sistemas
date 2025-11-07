package com.login.exemplo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.exemplo.dto.ProdutoRequestDTO;
import com.login.exemplo.dto.ProdutoResponseDTO;
import com.login.exemplo.entity.Produto;
import com.login.exemplo.repositories.ProdutoRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@PostMapping(value = "/cadastro")
	public ResponseEntity<Produto> savePdt(@Valid @RequestBody ProdutoRequestDTO pdt){
		Produto produto = new Produto(pdt.getNome(), pdt.getPreco(), pdt.getQuantidade());
		produtoRepository.save(produto);
		return ResponseEntity.ok(produto);
	}
	
	@GetMapping(value = "listar/fiama")
	public List<ProdutoResponseDTO> listarProduto1() {  
	    List<Produto> produto = produtoRepository.findAll();
	    List<ProdutoResponseDTO> produtoDTO = produto.stream()
	        .map(u -> new ProdutoResponseDTO(u.getNome(), u.getPreco(), u.getQuantidade()))
	        .toList();

	   return produtoDTO;
	    
	}
	
	@GetMapping(value = "/todos")
	public List<Produto> listarProduto(){
		return produtoRepository.findAll();
	}
	
	@GetMapping(value = "/{id}")
	public Optional<Produto> produtoId(@PathVariable int id){
		return produtoRepository.findById(id);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<?> deletar(@PathVariable int id) {
		if(produtoRepository.existsById(id)) {
			produtoRepository.deleteById(id);
			return ResponseEntity.status(HttpStatus.OK).body("Excluido com sucesso");
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Este id não existe");
		}
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Produto> alterar (@PathVariable int id, @RequestBody Produto novo){
		Optional<Produto> ProdutoExistente = produtoRepository.findById(id);
		
		if(ProdutoExistente.isPresent()) {
			Produto Produto = ProdutoExistente.get();
			Produto.setQuantidade(novo.getQuantidade());
			produtoRepository.save(Produto);
			return ResponseEntity.ok(Produto);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	

}
