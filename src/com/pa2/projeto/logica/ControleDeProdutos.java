package com.pa2.projeto.logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ControleDeProdutos {
	
	/*Classe respons�vel pelo armazenamento de toda informa��o
	 * relacionada a cadastro, exclus�o, busca e altera��o de produtos.
	 */
	
	private List<Produto> produtos;

	public ControleDeProdutos() {
		produtos = new ArrayList<Produto>();
	}
	/*
	 * Cadastro do produto
	 * 
	 * Recebe um objeto do tipo produto tendo a responsabilidade de verificar a
	 * exist�ncia ou cadastrar
	 */
	public void cadastrarProduto(Produto produto)
			throws ProdutoJaCadastradoException {

		if (verificarProdutoExistente(produto.getCodigo())) {
			throw new ProdutoJaCadastradoException("Produto j� cadastrado");
		}
		produtos.add(produto);
	}
	/*
	 * Excluir - retorna o produto removido
	 * 
	 * Recebe o c�digo do produto tendo a responsabilidade de verificar a
	 * exist�ncia ou excluir.
	 */
	public Produto excluirProduto(int codigo)
			throws ProdutoInexistenteException {

		Produto produto = buscaProduto(codigo);

		if (produto == null) {
			throw new ProdutoInexistenteException("Produto j� inexistente");
		}
		produtos.remove(produto);
		return produto;
	}
	/*
	 * Verificar c�digo j� cadastrado - Retorna True se j� cadastrado
	 * 
	 * Recebe o c�digo do produto tendo a responsabilidade de verificar se
	 * existe ou n�o o produto informado
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
	 * Recebe o c�digo do produto sendo respons�vel pela busca retornando null
	 * caso n�o encontre.
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

	// Faz a altera��o dos dados do produto
	/*
	 * J� supondo que a verifica��o de exist�ncia j� tenha sido feita Recebe
	 * como par�metro um objeto do tipo produto para ser substitu�do pelo
	 * anterior.
	 */
	public void alterarProduto(Produto produto) {
		int posi��o = getPosicaoProduto(produto);
		produtos.set(posi��o, produto);
	}

	/*
	 * Verifica a posi��o do cliente na lista
	 * 
	 * Faz a busca do produto e retorna a posi��o que ele se encontra na lista
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