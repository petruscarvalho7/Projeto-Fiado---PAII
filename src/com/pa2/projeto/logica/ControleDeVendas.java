package com.pa2.projeto.logica;

import java.util.ArrayList;
import java.util.Iterator;

public class ControleDeVendas {

	/*
	 * Classe respons�vel pelo armazenamento de toda informa��o relacionada a
	 * vendas, exclus�o, busca e altera��o de produtos.
	 */

	private ArrayList<Venda> vendas;

	
	
	/*
	 * Cadastro de venda
	 * 
	 * Recebe um objeto do tipo venda tendo a responsabilidade de verificar a
	 * exist�ncia e cadastrar
	 */
	
	public void addVenda(Venda venda) throws VendaJaCadastradoException{
		if (verificarVendaExistente(venda.getNumeroVenda())) {
			throw new VendaJaCadastradoException("Cliente j� cadastrado");
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
	 * Recebe o cpf do cliente sendo respons�vel pela busca retornando null
	 * caso n�o encontre.
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
	 * Verificar venda j� cadastrada - Retorna True se j� cadastrada
	 * 
	 * Recebe o n�mero da venda tendo a responsabilidade de verificar se
	 * existe ou n�o a venda informada
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
	 * Recebe o n�mero da venda tendo a responsabilidade de verificar a
	 * exist�ncia e excluir.
	*/
	
	public Venda removerVenda(int numeroVenda) throws VendaInexistenteException{
		Venda venda = buscarVenda(numeroVenda);

		if (venda == null) {
			throw new VendaInexistenteException("A venda informada n�o existe!");
		}
		vendas.remove(venda);
		return venda;

	}

}
