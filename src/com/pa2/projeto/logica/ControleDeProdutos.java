package com.pa2.projeto.logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ControleDeProdutos {
	
	/*Classe responsável pelo armazenamento de toda informação
	 * relacionada a cadastro, exclusão, busca e alteração de produtos.
	 */
	
	private List<Produto> produtos;

	public ControleDeProdutos() {
		produtos = new ArrayList<Produto>();
	}
	/*
	 * Cadastro do produto
	 * 
	 * Recebe um objeto do tipo produto tendo a responsabilidade de verificar a
	 * existência ou cadastrar
	 */
	public void cadastrarProduto(Produto produto)
			throws ProdutoJaCadastradoException {

		if (verificarProdutoExistente(produto.getCodigo())) {
			throw new ProdutoJaCadastradoException("Produto já cadastrado");
		}
		produtos.add(produto);
	}
	/*
	 * Excluir - retorna o produto removido
	 * 
	 * Recebe o código do produto tendo a responsabilidade de verificar a
	 * existência ou excluir.
	 */
	public Produto excluirProduto(int codigo)
			throws ProdutoInexistenteException {

		Produto produto = buscaProduto(codigo);

		if (produto == null) {
			throw new ProdutoInexistenteException("Produto já inexistente");
		}
		produtos.remove(produto);
		return produto;
	}
	/*
	 * Verificar código já cadastrado - Retorna True se já cadastrado
	 * 
	 * Recebe o código do produto tendo a responsabilidade de verificar se
	 * existe ou não o produto informado
	 */
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

	/*
	 * Busca e retorna o produto caso encontre, retornado null caso negativo
	 * 
	 * Recebe o código do produto sendo responsável pela busca retornando null
	 * caso não encontre.
	 */

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

	// Faz a alteração dos dados do produto
	/*
	 * Já supondo que a verificação de existência já tenha sido feita Recebe
	 * como parâmetro um objeto do tipo produto para ser substituído pelo
	 * anterior.
	 */
	public void alterarProduto(Produto produto) {
		int posição = getPosicaoProduto(produto);
		produtos.set(posição, produto);
	}

	/*
	 * Verifica a posição do cliente na lista
	 * 
	 * Faz a busca do produto e retorna a posição que ele se encontra na lista
	 */

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