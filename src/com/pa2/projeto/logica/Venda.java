package com.pa2.projeto.logica;

import java.util.ArrayList;

public class Venda {

	private int numeroVenda;

	private ArrayList<Produto> produtosDaVenda;
		
	/*
	 * No construtor da classe venda passamos como parâmetro uma
	 * lista de produtos a serem adicionados à venda.
	 */

	public Venda(int numeroVenda, ArrayList<Produto> produtosDaVenda) {
		this.numeroVenda = numeroVenda;
		this.produtosDaVenda = produtosDaVenda;
	}

	public int getNumeroVenda() {
		return numeroVenda;
	}

	public void setNumeroVenda(int numeroVenda) {
		this.numeroVenda = numeroVenda;
	}

	public ArrayList<Produto> getProdutosDaVenda() {
		return produtosDaVenda;
	}
	
	public void setProdutosDaVenda(ArrayList<Produto> produtosDaVenda) {
		this.produtosDaVenda = produtosDaVenda;
	}

}
