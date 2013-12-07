package com.example.projetofiado;

public class ClienteInexistenteException extends RuntimeException{
	
	public ClienteInexistenteException(String msg){
		super(msg);
	}

}