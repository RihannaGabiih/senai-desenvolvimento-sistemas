package com.login.exemplo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ProdutoRequestDTO {

	@NotBlank(message = "Tem que ter um nome")
	private String nome;

	@NotNull(message = "Não pode ser gratis")
	private double preco;

	@NotNull(message = "Tem que ter pelo menos algo")
	private int quantidade;

	public ProdutoRequestDTO() {
		super();
	}

	public ProdutoRequestDTO(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	

}
