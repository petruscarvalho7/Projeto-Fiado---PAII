package com.example.projetofiado.negocio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GerenteVendas implements FacadeFiadoVendas {

	private HashMap<Cliente,Venda> vendas;
	
	public GerenteVendas(){
		this.vendas = new HashMap<Cliente, Venda>();
	}
	
	@Override
	public void addVenda(Cliente cliente, String nome, ArrayList<Produto> produtosVenda) {
		Venda venda = criarVenda(nome,produtosVenda);
		this.vendas.put(cliente, venda);
	}

	public Map<Cliente,Venda> getVendas() {
		return vendas;
	}

	public void setVendas(Map<Cliente,Venda> vendas) {
		this.vendas = (HashMap<Cliente, Venda>) vendas;
	}

	@Override
	public List<Venda> buscarVendas(Cliente c) {
		List<Venda> listaVendas = new ArrayList<Venda>();
		
		if(this.vendas.containsKey(c)){
			
			for(Cliente aux : this.vendas.keySet()){
				
				if(aux.equals(c)) {
					
					listaVendas.add(this.vendas.get(aux));
			
				}
				
			}	
			
		}return listaVendas;
		
	}

	@Override
	public void removerVenda(Cliente c, Venda venda) {

		if(this.vendas.containsKey(c)){
			
			for(Cliente aux : this.vendas.keySet()){
				
				if((c.equals(aux) && (this.vendas.get(aux).equals(venda)))) {
					
					this.vendas.remove(aux);
			
				}
				
			}	
			
		}
		
	}

	private Venda criarVenda(String nome, ArrayList<Produto> produtosVenda) {
		Venda venda = new Venda(nome,produtosVenda);
		return venda;
	}

}
