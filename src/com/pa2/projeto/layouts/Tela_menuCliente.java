package com.pa2.projeto.layouts;

import com.pa2.projeto.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_menuCliente extends Activity {

	Button btNovoCliente, btRemove, btBuscar, btVoltar;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_cliente);
		// Inicializa os componentes
		inicialize();
		// Verifica as ações dos botões
		update();

	}

	private void inicialize() {

		btNovoCliente = (Button) findViewById(R.id.btNovoCadastroCliente);
		btRemove = (Button) findViewById(R.id.btExcluir);
		btBuscar = (Button) findViewById(R.id.btBuscar);
		btVoltar = (Button) findViewById(R.id.btVoltar);

	}

	private void update() {

		btNovoCliente.setOnClickListener(new View.OnClickListener() {

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
