package com.example.projetofiado.negocio;

import java.util.Date;

public class Cliente {

	private String nome, cpf, rg, sexo, telefone, email, referencia;
	private Date nascimento;
	private Endereco endereco;
	
	
	public Cliente(String nome, String cpf, String sexo, String telefone, String email, String referencia,
			Date nascimento, Endereco endereco){
		this.nome = nome;
		this.cpf = cpf;
		this.sexo = sexo;
		this.telefone = telefone;
		this.email = email;
		this.referencia = referencia;
		this.nascimento = nascimento;
		this.endereco = endereco;
	}
	
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
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	
	
}
