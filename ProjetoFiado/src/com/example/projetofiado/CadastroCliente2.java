package com.example.projetofiado;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class CadastroCliente2 extends Activity {
	
	EditText edTxtEndereco, edTxtNumero, edTxtCidade, edTxtPais, edTxtBairro, edTxtCep; 
	Button btProximo, btVoltar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.tela_cadastrocliente_segunda);
		inicializacao();

	}
	private void inicializacao(){
		
		btProximo = (Button)findViewById(R.id.btProximo);
		btVoltar = (Button)findViewById(R.id.btVoltar);
		
		edTxtEndereco = (EditText)findViewById(R.id.ETxtEndereco);
		edTxtNumero = (EditText)findViewById(R.id.ETxtNumero);
		edTxtCidade = (EditText)findViewById(R.id.ETxtCidade);
		edTxtBairro = (EditText)findViewById(R.id.ETxtBairro);
		edTxtPais = (EditText)findViewById(R.id.ETxtPais);
		edTxtCep = (EditText)findViewById(R.id.ETxtCep);
		
		
	}
}