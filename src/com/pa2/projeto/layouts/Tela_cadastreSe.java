package com.pa2.projeto.layouts;

import com.pa2.projeto.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela_cadastreSe extends Activity{
	
	Intent telaLogin;
	EditText nome, senha, repetirSenha;
	Button btVoltar, btSalvar;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_cadastrese);
		
		
		//Inicializa os componentes
		inicialize();
		//Verifica as ações dos botões
		update();
		
	}
	private void inicialize() {

		btVoltar = (Button) findViewById(R.id.BtVoltar);
		btSalvar = (Button) findViewById(R.id.btSalvar);
		nome = (EditText) findViewById(R.id.ETxtNomeUsuario);
		senha = (EditText) findViewById(R.id.ETxtSenha);
		repetirSenha = (EditText) findViewById(R.id.ETxtRepetirSenha);
		telaLogin = new Intent(this, Tela_login.class);
		
	}
	private void update() {

		btVoltar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				
				//Voltar

			}
		});

		btSalvar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				
				//Finalizar cadastro

			}
		});

	}

}
