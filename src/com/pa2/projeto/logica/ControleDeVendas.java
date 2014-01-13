package com.pa2.projeto.logica;

import java.util.ArrayList;
import java.util.Iterator;

public class ControleDeVendas {

	/*
	 * Classe responsável pelo armazenamento de toda informação relacionada a
	 * vendas, exclusão, busca e alteração de produtos.
	 */

	private ArrayList<Venda> vendas;

	
	
	/*
	 * Cadastro de venda
	 * 
	 * Recebe um objeto do tipo venda tendo a responsabilidade de verificar a
	 * existência e cadastrar
	 */
	
	public void addVenda(Venda venda) throws VendaJaCadastradoException{
		if (verificarVendaExistente(venda.getNumeroVenda())) {
			throw new VendaJaCadastradoException("Cliente já cadastrado");
		}
		vendas.add(venda);

	}

	public ArrayList<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}

	
	
	/*
	 * Busca e retorna o cliente caso encontre, retornado null caso negativo
	 * 
	 * Recebe o cpf do cliente sendo responsável pela busca retornando null
	 * caso não encontre.
	 */
	
	public Venda buscarVenda(int numeroVenda) {

		Venda venda = null;
		boolean existe = false;
		Iterator<Venda> iterador = vendas.iterator();

		while (iterador.hasNext() && existe == false) {
			venda = iterador.next();
			if (venda.getNumeroVenda() == numeroVenda) {
				existe = true;
			}
		}
		return venda;
	}
	
	/*
	 * Verificar venda já cadastrada - Retorna True se já cadastrada
	 * 
	 * Recebe o número da venda tendo a responsabilidade de verificar se
	 * existe ou não a venda informada
	 */
	public boolean verificarVendaExistente(int numeroDaVenda) {

		boolean existe = false;
		Iterator<Venda> iterador = vendas.iterator();
		Venda venda;
		while (iterador.hasNext() && existe == false) {
			venda = iterador.next();
			if (venda.getNumeroVenda()== numeroDaVenda) {
				existe = true;
			}
		}
		return existe;
	}

	
	/*
	 * Remover - retorna a venda removida
	 * 
	 * Recebe o número da venda tendo a responsabilidade de verificar a
	 * existência e excluir.
	*/
	
	public Venda removerVenda(int numeroVenda) throws VendaInexistenteException{
		Venda venda = buscarVenda(numeroVenda);

		if (venda == null) {
			throw new VendaInexistenteException("A venda informada não existe!");
		}
		vendas.remove(venda);
		return venda;

	}

}
