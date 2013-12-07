package com.pa2.projeto.logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ControleDeProdutos {
	private List<Produto> produtos;

	public ControleDeProdutos() {
		produtos = new ArrayList<Produto>();
	}

	// Cadastrar

	public void cadastrarProduto(Produto produto)
			throws ProdutoJaCadastradoException {

		if (verificarProdutoExistente(produto.getCodigo())) {
			throw new ProdutoJaCadastradoException("Produto j� cadastrado");
		}
		produtos.add(produto);
	}

	// Excluir - retorna o produto removido

	public Produto excluirProduto(int codigo)
			throws ProdutoInexistenteException {

		Produto produto = buscaProduto(codigo);

		if (produto == null) {
			throw new ProdutoInexistenteException("Produto j� inexistente");
		}
		produtos.remove(produto);
		return produto;
	}

	// Verificar c�digo j� cadastrado - Retorna True se j� cadastrado
	public boolean verificarProdutoExistente(int codigo) {

		boolean existe = false;
		Iterator<Produto> iterador = produtos.iterator();
		Produto produto;
		while (iterador.hasNext() && existe == false) {
			produto = iterador.next();
			if (produto.getCodigo() == codigo) {
				existe = true;
			}
		}
		return existe;
	}

	// Busca e retorna o produto caso encontre, retornado null caso negativo
	public Produto buscaProduto(int codigo) {
		Produto produto = null;
		boolean existe = false;
		Iterator<Produto> iterador = produtos.iterator();

		while (iterador.hasNext() && existe == false) {
			produto = iterador.next();
			if (produto.getCodigo() == codigo) {
				existe = true;
			}
		}
		return produto;
	}

	// Faz a altera��o dos dados do cliente
	/*
	 * J� supondo que a verifica��o de exist�ncia j� tenha sido feita
	 */
	public void anterarProduto(Produto produto) {
		int posi��o = getPosicaoProduto(produto);
		produtos.set(posi��o, produto);

	}

	// Verifica a posi��o do cliente na lista
	private int getPosicaoProduto(Produto produtoP) {
		int contador = 0;
		Produto produto;
		boolean existe = false;
		Iterator<Produto> iterador = produtos.iterator();

		while (iterador.hasNext() && existe == false) {
			produto = iterador.next();
			if (produto.getCodigo() == produtoP.getCodigo()) {
				existe = true;
			}
			contador++;
		}
		return contador;

	}

}
