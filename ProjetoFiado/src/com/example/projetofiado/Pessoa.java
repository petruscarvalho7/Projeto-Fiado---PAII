package com.example.projetofiado;

import java.util.Date;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private String rg;
	private Endereco endereco;
	private Date dataDeNascimento;
	private String sexo;
	private String telefone;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}
