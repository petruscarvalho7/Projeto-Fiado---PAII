package com.pa2.projeto.logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ControleDeClientes {
	
	/*Classe respons�vel pelo armazenamento de toda informa��o
	 * relacionada a cadastro, exclus�o, busca e altera��o de clientes.
	 */
	
	private List<Cliente> clientes;

	public ControleDeClientes() {
		clientes = new ArrayList<Cliente>();
	}

	/*
	 * Cadastro do cliente
	 * 
	 * Recebe um objeto do tipo cliente, tendo a responsabilidade de verificar a
	 * exist�ncia ou cadastrar
	 */
	public void cadastrarCliente(Cliente cliente)
			throws ClienteJaCadastradoException {

		if (verificarCpfExistente(cliente.getCpf())) {
			throw new ClienteJaCadastradoException("Cliente j� cadastrado");
		}
		clientes.add(cliente);
	}

	/*
	 * Excluir - retorna o cliente removido
	 * 
	 * Recebe o c�digo do cliente tendo a responsabilidade de verificar a
	 * exist�ncia ou excluir.
	 */
	public Cliente excluirCliente(String cpf)
			throws ClienteInexistenteException {

		Cliente cliente = buscaCliente(cpf);

		if (cliente == null) {
			throw new ClienteInexistenteException("Cliente j� inexistente");
		}
		clientes.remove(cliente);
		return cliente;
	}

	/*
	 * Verificar cpf j� cadastrado - Retorna True se j� cadastrado
	 * 
	 * Recebe o cpf do cliente tendo a responsabilidade de verificar se
	 * existe ou n�o o cpf informado
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
	 * Recebe o cpf do cliente sendo respons�vel pela busca retornando null
	 * caso n�o encontre.
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

	// Faz a altera��o dos dados do cliente
	/*
	 * J� supondo que a verifica��o de existencia j� tenha sido feita
	 */
	public void anterarDados(Cliente cliente) {
		int posi��o = getPosicaoCliente(cliente);
		clientes.set(posi��o, cliente);
	}

	// Verifica a posi��o do cliente na lista
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
