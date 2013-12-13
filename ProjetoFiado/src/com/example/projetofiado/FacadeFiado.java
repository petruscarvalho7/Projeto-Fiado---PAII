package com.example.projetofiado;

import java.util.ArrayList;

public interface FacadeFiado {

	//ArrayList do tipo String, feito para testes!
	public void addVenda(String nome,  ArrayList<String> produtosAdd);
	
	public void buscar(Object obj);
	
	public void remover(Object obj);
}
