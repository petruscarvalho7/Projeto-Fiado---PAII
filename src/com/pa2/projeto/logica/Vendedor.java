package com.pa2.projeto.logica;

import java.util.Date;

public class Vendedor extends Pessoa{
	String login;
	String senha;
	
	public Vendedor(String login, String senha, String nome, String cpf, String rg, Endereco endereco,
			Date dataDeNascimento,String sexo, String telefone, String ddd){
		
		super.setNome(nome);
		super.setCpf(cpf);
		super.setRg(rg);
		super.setEndereco(endereco);
		super.setDataDeNascimento(dataDeNascimento);
		super.setSexo(sexo);
		super.setTelefone(telefone);
		super.setDdd(ddd);
	}
	
	
	
	

}
