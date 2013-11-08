package com.ufpb.example.execi_pa;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main extends Activity {

	
	Button btPrimeiro, btSegundo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		btPrimeiro = (Button) findViewById(R.id.btPrimeiro);
		
		btSegundo = (Button) findViewById(R.id.btSegundo);
		
		btPrimeiro.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				
				Toast t = Toast.makeText(Main.this, btPrimeiro.getText(), Toast.LENGTH_SHORT);
				t.show();
			}
		});
		
		btSegundo.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				
				Toast t = Toast.makeText(Main.this, btSegundo.getText(), Toast.LENGTH_SHORT);
				t.show();
				
				//btSegundo.setText("Paivei");
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
