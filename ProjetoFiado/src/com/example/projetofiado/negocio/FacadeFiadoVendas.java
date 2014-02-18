package com.example.projetofiado.negocio;

import java.util.ArrayList;
import java.util.List;

public interface FacadeFiadoVendas {

	//ArrayList do tipo String, feito para testes!
	public void addVenda(Cliente cliente, String nome, ArrayList<Produto> produtosVenda);
	
	public List<Venda> buscarVendas(Cliente c);
	
	public void removerVenda(Cliente c, Venda venda);
	
	
}
