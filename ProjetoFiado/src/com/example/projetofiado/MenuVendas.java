package com.example.projetofiado;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MenuVendas extends Activity{
	
	Button btNovaVenda, btBuscar, btExcluir, btVoltar;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_venda);
		inicializacao();

	}
	private void inicializacao(){
		
		btNovaVenda = (Button)findViewById(R.id.btNovaVenda);
		btBuscar = (Button)findViewById(R.id.btBuscar);
		btExcluir = (Button)findViewById(R.id.btExcluir);
		btVoltar = (Button)findViewById(R.id.btVoltar);
		
	}
	

}
