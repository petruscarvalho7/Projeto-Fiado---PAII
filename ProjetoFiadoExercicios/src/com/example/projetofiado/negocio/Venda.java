package com.example.projetofiado.negocio;

import java.util.ArrayList;

public class Venda {

	private String nome;
	
	private ArrayList<Produto> produtosDaVenda;
	
	public Venda(String nome, ArrayList<Produto> produtosDaVenda){
		this.nome = nome;
		this.produtosDaVenda = produtosDaVenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Produto> getProdutosDaVenda() {
		return produtosDaVenda;
	}

	public void setProdutosDaVenda(ArrayList<Produto> produtosDaVenda) {
		this.produtosDaVenda = produtosDaVenda;
	}
	
}
