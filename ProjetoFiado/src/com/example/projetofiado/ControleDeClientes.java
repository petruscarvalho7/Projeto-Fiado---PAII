package com.example.projetofiado;

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
			throw new ClienteJaCadastradoException("Cliente já cadastrado");
		}
		clientes.add(cliente);
	}

	// Excluir - retorna o cliente removido

	public Cliente excluirCliente(String cpf)
			throws ClienteInexistenteException {
		
		Cliente cliente = buscaCliente(cpf);
		
		if (cliente==null) {
			throw new ClienteInexistenteException("Cliente já inexistente");
		}
		clientes.remove(cliente);
		return cliente;
	}

	// Verificar CPF já cadastrado - Retorna True se já cadastrado
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
	

}
