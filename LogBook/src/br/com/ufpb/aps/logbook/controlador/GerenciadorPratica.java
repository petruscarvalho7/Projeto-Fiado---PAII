package br.com.ufpb.aps.logbook.controlador;

import java.util.ArrayList;
import java.util.List;

import br.com.ufpb.aps.logbook.entidade.Aluno;
import br.com.ufpb.aps.logbook.entidade.Disciplina;
import br.com.ufpb.aps.logbook.entidade.Pratica;
import br.com.ufpb.aps.logbook.entidade.Resposta;
import br.com.ufpb.aps.logbook.excecao.Excecao;

public class GerenciadorPratica {

	private List<Pratica> listaPraticas = new ArrayList<Pratica>();
	private List<Disciplina> listaDisciplinas = new ArrayList<Disciplina>();
	private List<Disciplina> listaDisciplina;

	public void adicionarPraticaProfessor(Pratica novaPratica) {
		listaPraticas.add(novaPratica);
	}

	public Disciplina editarPratica(Pratica pratica, Disciplina disciplina, Resposta resposta) {

		for (Disciplina d : listaDisciplinas) {
			if (disciplina.getCodigoDisciplina().equals(d.getCodigoDisciplina())) {
				
				return d;
			}

		}
		return disciplina;
	}

	public List<Pratica> pesquisarPratica(Aluno aluno) {
		return getPraticas();

	}

	public void deletarPratica(int numeroPratica) {
		listaPraticas.remove(numeroPratica);
	}

	public List<Pratica> getPraticas() {
		return getPraticas();
	}

	public void setPraticas(List<Pratica> praticas) {
		this.listaPraticas = praticas;
	}

	public List<Disciplina> getListaDisciplina() {
		return getListaDisciplina();
	}

	public void setListaDisciplina(List<Disciplina> listaDisciplina) {
		this.listaDisciplina = listaDisciplina;
	}
}
