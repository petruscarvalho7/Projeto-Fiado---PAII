package br.com.ufpb.aps.logbook.excecao;

public class Excecao extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public Excecao(String string) {
		super(string);
	}
}