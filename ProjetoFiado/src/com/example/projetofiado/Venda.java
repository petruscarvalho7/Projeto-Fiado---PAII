package com.example.projetofiado;

import java.util.ArrayList;

public class Venda {

	private String nome;
	
	private ArrayList<String> produtosDaVenda;
	
	public Venda(String nome, ArrayList<String> produtosDaVenda){
		this.nome = nome;
		this.produtosDaVenda = produtosDaVenda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<String> getProdutosDaVenda() {
		return produtosDaVenda;
	}

	public void setProdutosDaVenda(ArrayList<String> produtosDaVenda) {
		this.produtosDaVenda = produtosDaVenda;
	}
	
}
