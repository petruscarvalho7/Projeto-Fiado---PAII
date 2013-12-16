package com.example.projetofiado;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CadastroProduto extends Activity{
	
	Button btFinalizar, btVoltar;
	EditText edTxtNome, edTxtTipo, edTxtPreco, edTxtCodigo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_cadastro_produto);
		inicializacao();

	}
	private void inicializacao(){
		
		edTxtNome = (EditText)findViewById(R.id.campoNome);
		edTxtCodigo = (EditText)findViewById(R.id.campoCodigo);
		edTxtPreco = (EditText)findViewById(R.id.campoPreco);
		edTxtTipo = (EditText)findViewById(R.id.campoTipo);
		
		btFinalizar = (Button)findViewById(R.id.btFinalizar);
		btVoltar = (Button)findViewById(R.id.btVoltar);
		
	}
	

}
