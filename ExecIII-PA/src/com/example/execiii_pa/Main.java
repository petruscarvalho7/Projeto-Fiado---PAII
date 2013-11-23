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

public class Main extends Activity {

	RadioGroup rg;
	RadioButton btRadioRed, btRadioBlue, btRadioYe;
	
	ImageButton btImRed, btImBl;
	
	TextView txView;
	
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
			}
        });
        
        btRadioBlue.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View arg0) {
				
				txView.setBackgroundColor(Color.BLUE);
				btRadioBlue.setChecked(true);
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
