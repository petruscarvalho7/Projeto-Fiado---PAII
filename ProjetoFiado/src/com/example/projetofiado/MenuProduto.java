package com.example.projetofiado;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MenuProduto extends Activity{
	
	Button btNovoProduto, btBuscar, btExcluir, btVoltar;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_produto);
		inicializacao();

	}
	private void inicializacao(){
		
		btNovoProduto = (Button)findViewById(R.id.btAdicionarProduto);
		btBuscar = (Button)findViewById(R.id.btBuscar);
		btExcluir = (Button)findViewById(R.id.btExcluir);
		btVoltar = (Button)findViewById(R.id.btVoltar);
		
	}
	

}

