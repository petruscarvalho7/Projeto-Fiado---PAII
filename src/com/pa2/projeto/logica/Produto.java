package com.pa2.projeto.logica;

public class Produto {
	
	String nome;
	String tipo;
	float valor;
	int codigo;
	
	public Produto(String nome, String tipo, float valor, int codigo){
		this.nome=nome;
		this.tipo=tipo;
		this.valor=valor;
		this.codigo=codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Float getValor() {
		return valor;
	}
	public void setValor(Float valor) {
		this.valor = valor;
	}

	
}
