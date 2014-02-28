package com.example.projetofiado.negocio;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

public class WebClient {
	private final String url;
	public WebClient(String url){
		this.url = url;
	}
	
	public String Post (String json){
		//Objeto para comunica��o com o servidor remoto
		DefaultHttpClient httpClient = new DefaultHttpClient();
		//Objeto que encapsula a string gerada com o JSON
		HttpPost post = new HttpPost(url);
		
		try{
			post.setEntity(new StringEntity(json));
			
			//Informa que o conteudo da requisi��o � do tipo JSON e solicita que a resposta tamb�m seja em JSON
			post.setHeader("Content-type", "application/json");
			post.setHeader("Accept", "application/json");
			
			//Requisi��o
			HttpResponse response = httpClient.execute(post);
			
			//Verifica��o de resposta
			String jsonResposta = EntityUtils.toString(response.getEntity());
			
			return jsonResposta;
		
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
	}
}
