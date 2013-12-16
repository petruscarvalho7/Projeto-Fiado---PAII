package com.example.projetofiado;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MenuClientes extends Activity{
	
	Button btNovoCadastro, btBuscar, btExcluir, btVoltar;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_cliente);
		inicializacao();

	}
	private void inicializacao(){
		
		btNovoCadastro = (Button)findViewById(R.id.btNovoCadastroCliente);
		btBuscar = (Button)findViewById(R.id.btBuscar);
		btExcluir = (Button)findViewById(R.id.btExcluir);
		btVoltar = (Button)findViewById(R.id.btVoltar);
		
	}
	

}
