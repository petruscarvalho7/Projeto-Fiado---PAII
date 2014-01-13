package com.pa2.projeto.layouts;

import com.pa2.projeto.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Tela_cadastroProduto extends Activity {

	EditText campoNome, campoCodigo, campoTipo, campoPreco;
	Button btVoltar, btSalvar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_cadastro_produto);

		// Inicializa os componentes
		inicialize();
		// Verifica as ações dos botões
		update();

	}

	private void inicialize() {

		btVoltar = (Button) findViewById(R.id.BtVoltar);
		btSalvar = (Button) findViewById(R.id.btSalvar);
		campoNome = (EditText) findViewById(R.id.campoNome);
		campoCodigo = (EditText) findViewById(R.id.campoCodigo);
		campoTipo = (EditText) findViewById(R.id.campoTipo);
		campoPreco = (EditText) findViewById(R.id.campoPreco);

	}

	private void update() {

		btVoltar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				// Voltar

			}
		});

		btSalvar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				// Finalizar cadastro

			}
		});

	}

}
