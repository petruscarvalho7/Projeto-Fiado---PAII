package com.example.execiii_pa;

import android.widget.ToggleButton;

public class Util implements FacadeUtil {

	@Override
	public String msgParaToast(boolean bool, ToggleButton tb) {
		String retorno = "";
		if(bool){ 
			retorno ="Com "+ (String) tb.getText();
		}else{
			retorno = "Sem " + (String) tb.getText();
			tb.setText("Off");
		}
		return retorno;
	}

}
