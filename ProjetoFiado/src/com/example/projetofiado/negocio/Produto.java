package com.example.projetofiado.negocio;

public class Produto {

	private String nome, codigo;
	private double preco;
	private TipoProduto tipo;
	
	public Produto(String nome, String codigo, double preco){
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.tipo = TipoProduto.PADRAO;
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
	public TipoProduto getTipo() {
		return tipo;
	}
	public void setTipo(TipoProduto tipo) {
		this.tipo = tipo;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
