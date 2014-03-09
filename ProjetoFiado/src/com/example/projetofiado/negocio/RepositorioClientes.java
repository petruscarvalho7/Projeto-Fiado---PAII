package com.example.projetofiado.negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.example.projetofiado.negocio.Cliente.Clientes;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;

public class RepositorioClientes {

	private static final String CATEGORIA = "cliente";
	
	//Nome do BD
	private static final String NOME_BANCO = "bdProjetoFiado";
	
	//Nome da tabela
	private static final String NOME_TABELA = "Cliente";
	
	protected SQLiteDatabase db;
	
	public RepositorioClientes(Context ctx){
		db = ctx.openOrCreateDatabase(NOME_BANCO, Context.MODE_PRIVATE, null);
	}
	
	protected RepositorioClientes(){
		
	}
	
	//Salvar cliente, insere ou atualiza
	public long salvar(Cliente cliente){
		long id = cliente.id;
		if(id != 0){
			atualizar(cliente);
		}else{
			id = inserir(cliente);
		}
		return id;
	}

	private int atualizar(Cliente cliente) {
		ContentValues valores = new ContentValues();
		valores.put(Clientes.NOME, cliente.getNome());
		valores.put(Clientes.CPF, cliente.getCpf());
		valores.put(Clientes.EMAIL, cliente.getEmail());
		valores.put(Clientes.ENDERECO, cliente.getEndereco().toString());
		valores.put(Clientes.NASCIMENTO, cliente.getNascimento().toString());
		valores.put(Clientes.REFERENCIA, cliente.getReferencia());
		valores.put(Clientes.SEXO, cliente.getSexo());
		valores.put(Clientes.TELEFONE, cliente.getTelefone());
		
		String _id = String.valueOf(cliente.id);
		String where = Clientes._ID + "=?";
		String[] argsWhere = new String[] { _id };
		int contador = atualizar(valores, where, argsWhere);
		return contador;
	}
	
	//Atualizar cliente com valores
	public int atualizar(ContentValues valores, String where, String[] whereArgs){
		int contador = db.update(NOME_TABELA, valores, where, whereArgs);
		Log.i(CATEGORIA, "Atualizou [ "+contador+"] registros");
		return contador;
		
	}
	
	//Inserir novo cliente
	public long inserir(Cliente cliente){
		ContentValues valores = new ContentValues();
		valores.put(Clientes.NOME, cliente.getNome());
		valores.put(Clientes.CPF, cliente.getCpf());
		valores.put(Clientes.EMAIL, cliente.getEmail());
		valores.put(Clientes.ENDERECO, cliente.getEndereco().toString());
		valores.put(Clientes.NASCIMENTO, cliente.getNascimento().toString());
		valores.put(Clientes.REFERENCIA, cliente.getReferencia());
		valores.put(Clientes.SEXO, cliente.getSexo());
		valores.put(Clientes.TELEFONE, cliente.getTelefone());
		long id = inserir(valores);
		
		return id;
	}
	
	public long inserir(ContentValues valores){
		long id = db.insert(NOME_TABELA, "", valores);
		return id;
	}
	
	//Deleta cliente
	public int deletar(long id){
		String where = Clientes._ID + "=?";
		String _id = String.valueOf(id);
		String[] argsWhere = new String[] {_id};
		int contador = deletar(where,argsWhere);
		return contador;
	}

	private int deletar(String where, String[] argsWhere) {
		int contador = db.delete(NOME_TABELA, where, argsWhere);
		Log.i(CATEGORIA,"Deletou ["+contador+"] registros");
		return contador;
	}
	
	//Buscar cliente pelo id
	@SuppressWarnings("deprecation")
	public Cliente buscarCliente(long id){
		Cursor c = db.query(true, NOME_TABELA, Cliente.colunas, Clientes._ID + "=" + id, null, null, null, null, null, null);
		
		if(c.getCount() > 0){
			//Para posicionar no primero elemento do cursor
			c.moveToFirst();
			Cliente cliente = new Cliente();
			cliente.id = c.getLong(0);
			cliente.setNome(c.getString(1));
			cliente.setCpf(c.getString(2));
			cliente.setRg(c.getString(3));
			cliente.setSexo(c.getString(4));
			cliente.setTelefone(c.getString(5));
			cliente.setEmail(c.getString(6));
			cliente.setReferencia(c.getString(7));
			cliente.setNascimento(new Date(c.getString(8)));
			cliente.setEndereco(new Endereco(c.getString(9)));
			
			return cliente;
		}else{
			return null;
		}
	}
	
	//Retorna cursor com todos os clientes
	public Cursor getCursor(){
		try{
			return db.query(NOME_TABELA, Cliente.colunas, null, null, null, null, null, null);
		}catch(SQLException e){
			Log.e(CATEGORIA, "Erro de DB: "+ e.toString() );
			return null;
		}
	}
	
	//Retorna lista com todos os clientes
	@SuppressWarnings("deprecation")
	public List<Cliente> listarClientes(){
		Cursor c = getCursor();
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		if(c.moveToFirst()){
			//Recuperar indices das colunas
			int idxId = c.getColumnIndex(Clientes._ID);
			int idxNome = c.getColumnIndex(Clientes.NOME);
			int idxCpf = c.getColumnIndex(Clientes.CPF);
			int idxRg = c.getColumnIndex(Clientes.RG);
			int idxSexo = c.getColumnIndex(Clientes.SEXO);
			int idxTelefone = c.getColumnIndex(Clientes.TELEFONE);
			int idxEmail = c.getColumnIndex(Clientes.EMAIL);
			int idxReferencia = c.getColumnIndex(Clientes.REFERENCIA);
			int idxNascimento = c.getColumnIndex(Clientes.NASCIMENTO);
			int idxEndereco = c.getColumnIndex(Clientes.ENDERECO);
			//Loop ate o final
			do{
				Cliente cliente = new Cliente();
				clientes.add(cliente);
				cliente.id = c.getLong(idxId);
				cliente.setNome(c.getString(idxNome));
				cliente.setCpf(c.getString(idxCpf));
				cliente.setRg(c.getString(idxRg));
				cliente.setSexo(c.getString(idxSexo));
				cliente.setTelefone(c.getString(idxTelefone));
				cliente.setEmail(c.getString(idxEmail));
				cliente.setReferencia(c.getString(idxReferencia));
				cliente.setNascimento(new Date(c.getString(idxNascimento)));
				cliente.setEndereco(new Endereco(c.getString(idxEndereco)));
			}while( c.moveToNext());
		}
		return clientes;
	}
	
	@SuppressWarnings("deprecation")
	public Cliente buscarClientePeloCPF(String cpf){
		
		Cliente cliente = null;
		
		try{
			Cursor c = db.query(NOME_TABELA, Cliente.colunas, Clientes.CPF + "='" + cpf + "'", null, null, null, null);
			if(c.moveToNext()){
				cliente = new Cliente();
				//Recuperando valores
				cliente.id = c.getLong(0);
				cliente.setNome(c.getString(0));
				cliente.setCpf(c.getString(1));
				cliente.setRg(c.getString(2));
				cliente.setSexo(c.getString(3));
				cliente.setTelefone(c.getString(4));
				cliente.setEmail(c.getString(5));
				cliente.setReferencia(c.getString(6));
				cliente.setNascimento(new Date(c.getString(7)));
				cliente.setEndereco(new Endereco(c.getString(8)));
			}
		}catch(SQLException e){
			Log.e(CATEGORIA, "Erro buscar Cliente por nome:" + e.toString());
			return null;
			
		}return cliente;
		
	}
	
	//Busca utilizando ContentProvider de cliente
	public Cursor query(SQLiteQueryBuilder queryBuilder, String[] projectionIn, String selection, String[] selectionArgs, String groupBy, 
			String having, String orderBy){
		Cursor c = queryBuilder.query(this.db, projectionIn, selection, selectionArgs, groupBy, having, orderBy);
		
		return c;
	}
	
	public void fecharBD(){
		if(db != null){
			db.close();
		}
	}
	
}
