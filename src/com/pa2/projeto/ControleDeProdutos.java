package com.pa2.projeto;

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
			throw new ProdutoJaCadastradoException("Produto já cadastrado");
		}
		produtos.add(produto);
	}

	// Excluir - retorna o produto removido

	public Produto excluirProduto(int codigo)
			throws ProdutoInexistenteException {
		
		Produto produto = buscaProduto(codigo);
		
		if (produto==null) {
			throw new ProdutoInexistenteException("Produto já inexistente");
		}
		produtos.remove(produto);
		return produto;
	}

	// Verificar código já cadastrado - Retorna True se já cadastrado
	public boolean verificarProdutoExistente(int codigo) {

		boolean existe = false;
		Iterator<Produto> iterador = produtos.iterator();
		Produto produto;
		while (iterador.hasNext() && existe == false) {
			produto = iterador.next();
			if (produto.getCodigo()==codigo) {
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
			if (produto.getCodigo()==codigo) {
				existe = true;
			}
		}
		return produto;
	}
	
}
