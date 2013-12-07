package com.pa2.projeto.logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ControleDeClientes {

	private List<Cliente> clientes;

	public ControleDeClientes() {
		clientes = new ArrayList<Cliente>();
	}

	// Cadastrar
	public void cadastrarCliente(Cliente cliente)
			throws ClienteJaCadastradoException {

		if (verificarCpfExistente(cliente.getCpf())) {
			throw new ClienteJaCadastradoException("Cliente j� cadastrado");
		}
		clientes.add(cliente);
	}

	// Excluir - retorna o cliente removido
	public Cliente excluirCliente(String cpf)
			throws ClienteInexistenteException {

		Cliente cliente = buscaCliente(cpf);

		if (cliente == null) {
			throw new ClienteInexistenteException("Cliente j� inexistente");
		}
		clientes.remove(cliente);
		return cliente;
	}

	// Verificar CPF j� cadastrado - Retorna True se j� cadastrado
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

	// Busca e retorna o cliente caso encontre, retornado null caso negativo
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
