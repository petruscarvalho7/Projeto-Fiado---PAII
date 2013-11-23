package com.example.execiii_pa;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main extends Activity {

	RadioGroup rg;
	RadioButton btRadioRed, btRadioBlue, btRadioYe;
	
	ImageButton btImRed, btImBl;
	
	ToggleButton tbRed, tbBlue, tbYe;
	
	TextView txView;
	
	FacadeUtil util = new Util();
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        rg = (RadioGroup) findViewById(R.id.rgColors);
        btImRed = (ImageButton) findViewById(R.id.imageView1);
        btImBl = (ImageButton) findViewById(R.id.imageView2);
        txView = (TextView) findViewById(R.id.textView1);
        btRadioRed = (RadioButton) findViewById(R.id.btRadioRed);
        btRadioBlue = (RadioButton) findViewById(R.id.btRadioBlue);
        btRadioYe = (RadioButton) findViewById(R.id.btRadioYellow);
        tbRed = (ToggleButton) findViewById(R.id.toggleButton1);
        tbBlue = (ToggleButton) findViewById(R.id.toggleButton2);
        tbYe = (ToggleButton) findViewById(R.id.toggleButton3);
        
        btImRed.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				
				txView.setBackgroundColor(Color.RED);
				btRadioRed.setChecked(true);
			}
        });
        
        btImBl.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				
				txView.setBackgroundColor(Color.BLUE);
				btRadioBlue.setChecked(true);
			}
        });
        
        btRadioYe.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				
				txView.setBackgroundColor(Color.YELLOW);
				btRadioYe.setChecked(true);
			}
        });
        
        btRadioRed.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				
				txView.setBackgroundColor(Color.RED);
				btRadioRed.setChecked(true);
				tbRed.setChecked(true);
			}
        });
        
        btRadioBlue.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				
				txView.setBackgroundColor(Color.BLUE);
				btRadioBlue.setChecked(true);
			}
        });
        
        tbRed.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				boolean mensagem;
				if(tbRed.isChecked()){
					//mensagem = "Com Vermelhor";
					mensagem = true;
					tbRed.setText("Vermelho");
					txView.setBackgroundColor(Color.RED);
				}else{
					//mensagem = "Sem Vermelhor";
					mensagem = false;
					txView.setBackgroundColor(Color.BLACK);
					tbRed.setText("Vermelho");
				}
				Toast t = Toast.makeText(Main.this, util.msgParaToast(mensagem,tbRed), Toast.LENGTH_SHORT);
				t.show();
			}
        });
        
        tbBlue.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				boolean mensagem;
				if(tbBlue.isChecked()){
					//mensagem = "Com Vermelhor";
					mensagem = true;
					tbBlue.setText("Azul");
					txView.setBackgroundColor(Color.BLUE);
					
				}else{
					//mensagem = "Sem Vermelhor";
					mensagem = false;
					txView.setBackgroundColor(Color.BLACK);
					tbBlue.setText("Azul");
				}
				Toast t = Toast.makeText(Main.this, util.msgParaToast(mensagem, tbBlue), Toast.LENGTH_SHORT);
				t.show();
			}
        });
        
        tbYe.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				boolean mensagem;
				if(tbYe.isChecked()){
					//mensagem = "Com Vermelhor";
					mensagem = true;
					txView.setBackgroundColor(Color.YELLOW);
					tbYe.setText("Amarelo");
				}else{
					//mensagem = "Sem Vermelhor";
					mensagem = false;
					txView.setBackgroundColor(Color.BLACK);
					tbYe.setText("Amarelo");
				}
				Toast t = Toast.makeText(Main.this, util.msgParaToast(mensagem, tbYe), Toast.LENGTH_SHORT);
				t.show();
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
