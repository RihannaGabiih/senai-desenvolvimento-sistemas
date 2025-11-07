package com.login.exemplo.dto;

import com.login.exemplo.entity.Produto;

public class ProdutoResponseDTO {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public ProdutoResponseDTO(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	

	public ProdutoResponseDTO(Produto pdt) {
		this.nome = pdt.getNome();
		this.preco = pdt.getPreco();
		this.quantidade = pdt.getQuantidade();
	}



	public ProdutoResponseDTO() {
	
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
	
	public double getSubTotal() {
	        return preco * quantidade;
	    }
	
	
	
	
	
	

}
