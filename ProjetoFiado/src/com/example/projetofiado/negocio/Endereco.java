package com.example.projetofiado.negocio;

public class Endereco {

	private String nomeRua, bairro;

	public Endereco(String string) {
		this.nomeRua = string;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
}
