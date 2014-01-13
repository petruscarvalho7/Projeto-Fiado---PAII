package com.pa2.projeto.layouts;

import com.pa2.projeto.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_menuProduto extends Activity {

	Button btNovoProduto, btRemove, btBuscar, btVoltar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_produto);
		// Inicializa os componentes
		inicialize();
		// Verifica as ações dos botões
		update();

	}

	private void inicialize() {

		btNovoProduto = (Button) findViewById(R.id.btAdicionarProduto);
		btRemove = (Button) findViewById(R.id.btExcluirProduto);
		btBuscar = (Button) findViewById(R.id.btBuscarProduto);
		btVoltar = (Button) findViewById(R.id.btVoltar);

	}

	private void update() {

		btNovoProduto.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// implementar

			}
		});

		btRemove.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// implementar

			}
		});
		btRemove.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// implementar
			}
		});

		btVoltar.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// implementar
			}
		});

	}

}
