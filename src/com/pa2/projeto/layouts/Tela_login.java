package com.pa2.projeto.layouts;

import com.pa2.projeto.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela_login extends Activity {

	EditText login, senha;
	Button btCadastreSe, btLogin;
	Intent telaCadastreSe, menuPrincipal;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_login);

		// Inicializa os componentes
		inicialize();
		// Verifica as ações dos botões
		update();

	}

	private void update() {

		btLogin.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				// Chama a tela de menu principal
				startActivity(menuPrincipal);

			}
		});

		btCadastreSe.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				// Chama a tela de cadastro vendedor
				startActivity(telaCadastreSe);

			}
		});

	}

	private void inicialize() {

		btLogin = (Button) findViewById(R.id.btLogin);
		btCadastreSe = (Button) findViewById(R.id.btCadastrar);
		login = (EditText) findViewById(R.id.ETxtNomeUsuario);
		senha = (EditText) findViewById(R.id.ETxtSenha);
		telaCadastreSe = new Intent(this, Tela_cadastreSe.class);
		// menuPrincipal = new Intent(this, Activity_Menu_Principal.class);
	}

}
