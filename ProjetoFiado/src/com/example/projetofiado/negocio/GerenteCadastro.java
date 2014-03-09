package com.example.projetofiado.negocio;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.ListActivity;

public class GerenteCadastro extends ListActivity implements FacadeFiadoCadastro {

	
	public static RepositorioUsuarios repositorio;
	List<Usuario> usuarios;
	//key = login; element = senha
	Map<String,String> logins;
	private Usuario usuarioSessao;
	
	public GerenteCadastro(){
		repositorio = new RepositorioUsuarios(this);
		this.usuarios = repositorio.listarUsuarios();
		this.logins = new HashMap<String, String>();
		try{	
			popularLogins();
		}catch (Exception e) {
		}
	}
	
	private void popularLogins() {
		for(Usuario u : this.usuarios){
			if(!this.logins.containsKey(u.getLogin())){
				this.logins.put(u.getLogin(), u.getSenha());
			}
		}
		
	}

	@Override
	public boolean login(String login, String senha) {
		if(this.logins.containsKey(login)){
			if(this.logins.get(login).equals(senha)){
				for(Usuario u : this.usuarios){
					if(u.getLogin().equals(login)){
						setUsuarioSessao(u);
					}
				}
				return true;
			}else{
				return false;
			}
		}
		
		return false;
	}

	@Override
	public String esqueceuSenha(String cpf) {
		for(Usuario u : this.usuarios){
			if(u.getCpf().equalsIgnoreCase(cpf)){
				return u.getSenha();
			}
		}return "Usuario n‹o cadastrado no sistema.";
	}

	@Override
	public boolean cadastro(String login, String senha, String cpf) {
		Usuario u = new Usuario(login,senha, cpf);
		for(Usuario aux : this.usuarios){
			if(aux.getLogin().equalsIgnoreCase(login)){
				return false;
			}
		}this.usuarios.add(u);
		repositorio.salvar(u);
		return true;
		
	}

	public Usuario getUsuarioSessao() {
		return usuarioSessao;
	}

	public void setUsuarioSessao(Usuario usuarioSessao) {
		this.usuarioSessao = usuarioSessao;
	}

}
