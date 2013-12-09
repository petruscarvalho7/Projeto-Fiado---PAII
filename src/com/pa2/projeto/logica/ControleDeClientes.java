package com.pa2.projeto.logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ControleDeClientes {
	
	/*Classe responsável pelo armazenamento de toda informação
	 * relacionada a cadastro, exclusão, busca e alteração de clientes.
	 */
	
	private List<Cliente> clientes;

	public ControleDeClientes() {
		clientes = new ArrayList<Cliente>();
	}

	/*
	 * Cadastro do cliente
	 * 
	 * Recebe um objeto do tipo cliente, tendo a responsabilidade de verificar a
	 * existência ou cadastrar
	 */
	public void cadastrarCliente(Cliente cliente)
			throws ClienteJaCadastradoException {

		if (verificarCpfExistente(cliente.getCpf())) {
			throw new ClienteJaCadastradoException("Cliente já cadastrado");
		}
		clientes.add(cliente);
	}

	/*
	 * Excluir - retorna o cliente removido
	 * 
	 * Recebe o código do cliente tendo a responsabilidade de verificar a
	 * existência ou excluir.
	 */
	public Cliente excluirCliente(String cpf)
			throws ClienteInexistenteException {

		Cliente cliente = buscaCliente(cpf);

		if (cliente == null) {
			throw new ClienteInexistenteException("Cliente já inexistente");
		}
		clientes.remove(cliente);
		return cliente;
	}

	/*
	 * Verificar cpf já cadastrado - Retorna True se já cadastrado
	 * 
	 * Recebe o cpf do cliente tendo a responsabilidade de verificar se
	 * existe ou não o cpf informado
	 */
	public boolean verificarCpfExistente(String cpf) {

		boolean existe = false;
		Iterator<Cliente> iterador = clientes.iterator();
		Cliente cliente;
		while (iterador.hasNext() && existe == false) {
			cliente = iterador.next();
			if (cliente.getCpf().compareTo(cpf) == 0) {
				existe = true;
			}
		}
		return existe;
	}

	/*
	 * Busca e retorna o cliente caso encontre, retornado null caso negativo
	 * 
	 * Recebe o cpf do cliente sendo responsável pela busca retornando null
	 * caso não encontre.
	 */
	public Cliente buscaCliente(String cpf) {
		Cliente cliente = null;
		boolean existe = false;
		Iterator<Cliente> iterador = clientes.iterator();

		while (iterador.hasNext() && existe == false) {
			cliente = iterador.next();
			if (cliente.getCpf().compareTo(cpf) == 0) {
				existe = true;
			}
		}
		return cliente;
	}

	// Faz a alteração dos dados do cliente
	/*
	 * Já supondo que a verificação de existencia já tenha sido feita
	 */
	public void anterarDados(Cliente cliente) {
		int posição = getPosicaoCliente(cliente);
		clientes.set(posição, cliente);
	}

	// Verifica a posição do cliente na lista
	private int getPosicaoCliente(Cliente clienteP) {
		int contador = 0;
		Cliente cliente;
		boolean existe = false;
		Iterator<Cliente> iterador = clientes.iterator();

		while (iterador.hasNext() && existe == false) {
			cliente = iterador.next();
			if (cliente.getCpf().compareTo(clienteP.getCpf()) == 0) {
				existe = true;
			}
			contador++;
		}
		return contador;

	}

}
