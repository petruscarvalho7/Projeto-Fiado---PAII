package com.example.projetofiado;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CadastroCliente3 extends Activity {
	
	EditText edTxtDdd, edTxtTelefone, edTxtEmail, edTxtReferencia; 
	Button btProximo, btVoltar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.tela_cadastrocliente_final);
		inicializacao();

	}
	private void inicializacao(){
		
		btProximo = (Button)findViewById(R.id.btProximo);
		btVoltar = (Button)findViewById(R.id.btVoltar);
		
		edTxtDdd = (EditText)findViewById(R.id.ETxtDdd);
		edTxtTelefone = (EditText)findViewById(R.id.ETxtTelefone);
		edTxtEmail = (EditText)findViewById(R.id.ETxtEmail);
		edTxtReferencia = (EditText)findViewById(R.id.ETxtReferecia);
				
	}
}
