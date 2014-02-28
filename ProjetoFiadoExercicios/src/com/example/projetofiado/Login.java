package com.example.projetofiado;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class Login extends Activity {
	
	EditText edTxtUsuario, edTxtSenha; 
	Button btProximo, btVoltar, btLogin, btCadastreSe, btEsqueceu ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_cadastrocliente_primeira);
		inicializacao();

	}
	private void inicializacao(){
		edTxtSenha = (EditText)findViewById(R.id.ETxtNomeUsuario);
		edTxtUsuario = (EditText)findViewById(R.id.ETxtSenha);
		
		btLogin = (Button)findViewById(R.id.btLogin);
		btCadastreSe = (Button)findViewById(R.id.btCadastrar);
		btEsqueceu = (Button)findViewById(R.id.btEsqueceuSenha);
	}
}
