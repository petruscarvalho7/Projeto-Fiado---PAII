package com.example.projetofiado;

import java.util.ArrayList;

public class GerenteVendas implements FacadeFiado {

	private ArrayList<Venda> vendas;
	
	@Override
	public void addVenda(String nome, ArrayList<String> produtosAdd) {
		// TODO Auto-generated method stub

	}

	public ArrayList<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}

}
