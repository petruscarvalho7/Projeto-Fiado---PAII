package com.example.projetofiado;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MenuPrincipal extends Activity{
	
	Button btGerVendas, btGerClientes, btGerProdutos, btPerfil, btSair;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_principal);
		inicializacao();

	}
	private void inicializacao(){
		
		btGerVendas = (Button)findViewById(R.id.btGerVendas);
		btGerClientes = (Button)findViewById(R.id.btGerenciarClientes);
		btGerProdutos = (Button)findViewById(R.id.btGerenciarProdutos);
		btSair = (Button)findViewById(R.id.btSair);
		
		

	}
	

}
