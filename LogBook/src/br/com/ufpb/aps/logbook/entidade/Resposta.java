package br.com.ufpb.aps.logbook.entidade;

public class Resposta {
	
	private String conteudo;
	
	public Resposta (String conteudo){
		this.conteudo = conteudo;
	}
	
	public Resposta(){
		
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
}
