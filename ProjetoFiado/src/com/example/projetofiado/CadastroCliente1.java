package com.example.projetofiado;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class CadastroCliente1 extends Activity {
	
	EditText edTxtNome, edTxtCpf, edTxtRg, edTxtDia, edTxtMes, edTxtAno; 
	RadioGroup rgSexo;
	RadioButton rdMasculino, rdFeminino;
	Button btProximo, btVoltar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_cadastrocliente_primeira);
		inicializacao();

	}
	private void inicializacao(){
		edTxtNome = (EditText)findViewById(R.id.ETxtNome);
		edTxtCpf = (EditText)findViewById(R.id.ETxtCpf);
		edTxtRg = (EditText)findViewById(R.id.ETxtRg);
		edTxtDia = (EditText)findViewById(R.id.ETxtDia);
		edTxtMes = (EditText)findViewById(R.id.ETxtMes);
		edTxtAno = (EditText)findViewById(R.id.ETxtAno);
		
		rgSexo = (RadioGroup)findViewById(R.id.RGSexo);
		rdMasculino = (RadioButton)findViewById(R.id.RBMasculino);
		rdFeminino = (RadioButton)findViewById(R.id.RBFeminino);
		
		btProximo = (Button)findViewById(R.id.btProximo);
		btVoltar = (Button)findViewById(R.id.btVoltar);
	}
}