package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class ProdutoModel {

	private String descricao;
	private double preco;
	private String fornecedor;
	private String categoria;
	
	
	public ProdutoModel(Long id, String descricao, double preco, String fornecedor, String categoria) {

		this.descricao = descricao;
		this.preco = preco;
		this.fornecedor = fornecedor;
		this.categoria = categoria;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
}

