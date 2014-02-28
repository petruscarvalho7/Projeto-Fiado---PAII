package com.example.projetofiado.negocio;

import java.util.List;

import org.json.JSONException;
import org.json.JSONStringer;

import android.util.Log;

public class VendaConverter {
	public String toJSON(List<String> listVendas){
		try {
		JSONStringer jsonStringer = new JSONStringer();
		
			jsonStringer.object().key("list").array().object().key("venda").array();
			
			//definindo a coleção de vendas
			for(String venda: listVendas){
				
				//carregar o nome das vendas no Json
				jsonStringer.object().key("nome").value(venda).endObject();
			}
			jsonStringer.endArray().endObject().endArray().endObject();
			
			
			return jsonStringer.toString();
			
		} catch (JSONException e) {
			Log.i("CADASTRO VENDAS", e.getMessage());
			return null;
		}
		
		
	}
	
	
	
}
