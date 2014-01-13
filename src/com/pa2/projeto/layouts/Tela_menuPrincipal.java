package com.pa2.projeto.layouts;

import com.pa2.projeto.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Tela_menuPrincipal extends Activity {

	Button btGerVendas, btGerClientes, btGerProdutos, btPerfil,
			btSair;
	Intent menuCliente, menuProduto, menuVenda, menuPerfil, menuLogin;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_principal);
		inicialize();
		update();

	}
	

	private void inicialize() {

		btGerVendas = (Button) findViewById(R.id.btGerVendas);
		btGerClientes = (Button) findViewById(R.id.btGerenciarClientes);
		btGerProdutos = (Button) findViewById(R.id.btGerenciarProdutos);
		btPerfil = (Button) findViewById(R.id.btPerfil);
		btSair = (Button) findViewById(R.id.btSair);
		menuCliente = new Intent(this, Tela_login.class);
		menuProduto = new Intent(this, Tela_login.class);
		menuVenda = new Intent(this, Tela_login.class);
		menuPerfil = new Intent(this, Tela_login.class);
		menuLogin = new Intent(this, Tela_login.class);
	}
	
	
	private void update() {

		btGerClientes.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//Chama a atividade gerenciador de clientes
				startActivity(menuCliente);

			}
		});

		btGerProdutos.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//Chama a atividade gerenciador de produtos
				startActivity(menuProduto);

			}
		});
		btGerVendas.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//Chama a atividade gerenciador de vendas
				startActivity(menuVenda);

			}
		});
		
		btPerfil.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//Chama a atividade perfil do vendedor
				startActivity(menuPerfil);

			}
		});
		
		btSair.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				//Chama a atividade de login
				startActivity(menuLogin);

			}
		});

	}

}
