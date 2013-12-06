package com.example.projetofiado;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ActivityMain extends Activity {

	Button btLogin, btCadastre, btEsqueceuSenha;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tela_login);
		
		btLogin = (Button) findViewById(R.id.btLogin);
		btCadastre = (Button) findViewById(R.id.btCadastrar);
		btEsqueceuSenha = (Button) findViewById(R.id.btEsqueceuSenha);
		
		btLogin.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				
				setContentView(R.layout.menu_principal);
			
			} 
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
