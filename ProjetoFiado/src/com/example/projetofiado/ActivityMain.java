package com.example.projetofiado;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ActivityMain extends Activity {

	Button bt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		bt = (Button) findViewById(R.id.botaoTeste);
		
		bt.setOnClickListener(new View.OnClickListener(){ 
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
