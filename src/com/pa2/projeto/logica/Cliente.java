package com.pa2.projeto.logica;

import java.util.Date;

public class Cliente extends Pessoa{
	
	Date dataDeCobranca;
	Conta conta;
	
	
	public Cliente(String nome, String cpf, String rg, Endereco endereco,
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
