package com.example.projetofiado.negocio;

import java.util.ArrayList;
import java.util.List;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;

import com.example.projetofiado.negocio.Usuario.Usuarios;

public class RepositorioUsuarios {

private static final String CATEGORIA = "usuario";
	
	//Nome do BD
	private static final String NOME_BANCO = "bdProjetoFiado";
	
	//Nome da tabela
	private static final String NOME_TABELA = "Usuario";
	
	protected SQLiteDatabase db;
	
	public RepositorioUsuarios(Context ctx){
		db = ctx.openOrCreateDatabase(NOME_BANCO, Context.MODE_PRIVATE, null);
	}
	
	protected RepositorioUsuarios(){
		
	}
	
	//Salvar cliente, insere ou atualiza
	public long salvar(Usuario usuario){
		long id = usuario.id;
		if(id != 0){
			atualizar(usuario);
		}else{
			id = inserir(usuario);
		}
		return id;
	}

	private int atualizar(Usuario usuario) {
		ContentValues valores = new ContentValues();
		valores.put(Usuarios._ID, usuario.id);
		valores.put(Usuarios.CPF, usuario.getCpf());
		valores.put(Usuarios.LOGIN, usuario.getLogin());
		valores.put(Usuarios.SENHA, usuario.getSenha());
		
		String id = String.valueOf(usuario.id);
		String where = Usuarios._ID	 + "=?";
		String[] argsWhere = new String[] { id };
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
	public long inserir(Usuario usuario){
		ContentValues valores = new ContentValues();
		valores.put(Usuarios.CPF, usuario.getCpf());
		valores.put(Usuarios.LOGIN, usuario.getLogin());
		valores.put(Usuarios.SENHA, usuario.getSenha());
		long id = inserir(valores);
		
		return id;
	}
	
	public long inserir(ContentValues valores){
		long id = db.insert(NOME_TABELA, "", valores);
		return id;
	}
	
	//Deleta cliente
	public int deletar(long id){
		String where = Usuarios._ID + "=?";
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
	public Usuario buscarUsuario(long id){
		Cursor c = db.query(true, NOME_TABELA, Cliente.colunas, Usuarios._ID + "=" + id, null, null, null, null, null, null);
		
		if(c.getCount() > 0){
			//Para posicionar no primero elemento do cursor
			c.moveToFirst();
			Usuario usuario = new Usuario();
			usuario.id = c.getLong(0);
			usuario.setCpf(c.getString(1));
			usuario.setLogin(c.getString(2));
			usuario.setSenha(c.getString(3));
			
			return usuario;
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
	public List<Usuario> listarUsuarios(){
		Cursor c = getCursor();
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		if(c.moveToFirst()){
			//Recuperar indices das colunas
			int idxId = c.getColumnIndex(Usuarios._ID);
			int idxCpf = c.getColumnIndex(Usuarios.CPF);
			int idxLogin = c.getColumnIndex(Usuarios.LOGIN);
			int idxSenha = c.getColumnIndex(Usuarios.SENHA);
			//Loop ate o final
			do{
				Usuario usuario = new Usuario();
				usuarios.add(usuario);
				usuario.id = c.getLong(idxId);
				usuario.setCpf(c.getString(idxCpf));
				usuario.setLogin(c.getString(idxLogin));
				usuario.setSenha(c.getString(idxSenha));
			}while( c.moveToNext());
		}
		return usuarios;
	}
	
	public Usuario buscarUsuarioPeloCPF(String cpf){
		
		Usuario usuario = null;
		
		try{
			Cursor c = db.query(NOME_TABELA, Usuario.colunas, Usuarios.CPF + "='" + cpf + "'", null, null, null, null);
			if(c.moveToNext()){
				usuario = new Usuario();
				//Recuperando valores
				usuario.id = c.getLong(0);
				usuario.setCpf(c.getString(1));
				usuario.setLogin(c.getString(2));
				usuario.setSenha(c.getString(3));
			}
		}catch(SQLException e){
			Log.e(CATEGORIA, "Erro buscar Usuario por CPF:" + e.toString());
			return null;
			
		}return usuario;
		
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
