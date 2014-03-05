package com.example.projetofiado.negocio;

import java.util.Date;

import android.net.Uri;
import android.provider.BaseColumns;

public class Cliente {
	
	public static String[] colunas = new String[]{ Clientes._ID , Clientes.NOME, Clientes.CPF, Clientes.SEXO, Clientes.TELEFONE, Clientes.EMAIL, Clientes.REFERENCIA, 
		Clientes.NASCIMENTO, Clientes.ENDERECO};
	
 
	public static final String AUTHORITY ="com.example.projetofiado.negocio.cliente";
	long id;	
	private String nome, cpf, rg, sexo, telefone, email, referencia;
	private Date nascimento;
	private Endereco endereco;
	
	
	public Cliente(long id,String nome,String rg, String cpf, String sexo, String telefone, String email, String referencia,
			Date nascimento, Endereco endereco){
		this.id = id;
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.sexo = sexo;
		this.telefone = telefone;
		this.email = email;
		this.referencia = referencia;
		this.nascimento = nascimento;
		this.endereco = endereco;
	}
	
	public Cliente() {
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	public static final class Clientes implements BaseColumns{
	
		
		//N‹o instanciar!!!
		private Clientes(){
			
		}
		
		//content://com.example.projetofiado.negocio.cliente/clientes
		public static final Uri CONTENT_URI = Uri.parse("content://"+ AUTHORITY +"/clientes");
		
		//Mime Type para todos os clientes
		public static final String CONTENT_TYPE ="vnd.android.cursor.dir/vnd.google.clientes";
		
		//Mime Type para unico cliente
		public static final String CONTENT_ITEM_TYPE = "vnd.android.cursor.item/vnd.google.clientes";
		
		//Ordenacao default para inserir no order by
		public static final String DEFAULT_SORT_ORDER = "_id ASC";
		
		//Campos
		public static final String NOME = "nome"; 
		public static final String CPF = "cpf";
		public static final String RG = "rg";
		public static final String ENDERECO = "endereco";

		public static final String NASCIMENTO = "nascimento";

		public static final String REFERENCIA = "referencia";

		public static final String EMAIL = "email";

		public static final String TELEFONE = "telefone";

		public static final String SEXO = "sexo";
		
		
	}
	
}
