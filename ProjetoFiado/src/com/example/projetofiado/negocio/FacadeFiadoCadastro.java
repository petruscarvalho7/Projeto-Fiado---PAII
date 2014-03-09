package com.example.projetofiado.negocio;

public interface FacadeFiadoCadastro {

	public boolean login(String login, String senha);
	
	public String esqueceuSenha(String cpf);
	
	public boolean cadastro(String login, String senha, String cpf);
	
	
}
