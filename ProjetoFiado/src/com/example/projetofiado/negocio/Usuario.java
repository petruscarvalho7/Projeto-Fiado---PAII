package com.example.projetofiado.negocio;

import android.net.Uri;
import android.provider.BaseColumns;

public class Usuario {
	
	public static String[] colunas = new String[]{Usuarios._ID, Usuarios.CPF , Usuarios.LOGIN, Usuarios.SENHA};
	public static final String AUTHORITY ="com.example.projetofiado.negocio.usuario";

	long id;
	private String login, senha, cpf;
	
	public Usuario(String login, String senha, String cpf){
		this.login = login;
		this.senha = senha;
		this.cpf = cpf;
	}

	public Usuario() {
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public static final class Usuarios implements BaseColumns{
		
		//Campos
		public static final String CPF = "cpf"; 
		public static final String LOGIN = "login";
		public static final String SENHA = "senha";
		
		//N‹o instanciar!!!
		private Usuarios(){
					
		}
				
		//content://com.example.projetofiado.negocio.cliente/clientes
		public static final Uri CONTENT_URI = Uri.parse("content://"+ AUTHORITY +"/usuarios");
				
		//Mime Type para todos os clientes
		public static final String CONTENT_TYPE ="vnd.android.cursor.dir/vnd.google.usuarios";
				
		//Mime Type para unico cliente
		public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.usuarios";
				
		//Ordenacao default para inserir no order by
		public static final String DEFAULT_SORT_ORDER = "_id ASC";
		
		
	}
	
}
