package br.com.ufpb.aps.logbook.fachada;


import java.util.List;

import br.com.ufpb.aps.logbook.entidade.Aluno;
import br.com.ufpb.aps.logbook.entidade.Disciplina;
import br.com.ufpb.aps.logbook.entidade.Pratica;
import br.com.ufpb.aps.logbook.entidade.Professor;
import br.com.ufpb.aps.logbook.entidade.Turma;
import br.com.ufpb.aps.logbook.entidade.Usuario;


public interface LogBookFacade {

	public void adicionarAluno(Aluno aluno);

	public Aluno pesquisarAluno(String matricula);

	public Aluno EditarDadosAluno(Aluno aluno);

	public void deletarAluno(String matricula);

	public List<Aluno> listaTodosAlunos();

	// Dados do Professor
	public void adicionarProfessor(Professor professor);

	public Professor pesquisarProfessor(String codigo);

	public Professor editarProfessor(Professor professor);

	public void deletarProfessor(String codigo);

	public List<Professor> listaTodosProfessores();

	// Dados do Usuário
	public void adicionarUsuario(Usuario novoUsuario);

	public void deletarUsuario(Usuario usuario);

	public Usuario pesquisarUsuario(String codigo, String matricula);

	public List<Usuario> getListaTodosUsuarios();

	// Dados da Turma
	public void adicionarTurma(Turma novaTurma);

	public Turma editarTurma(Turma turma);

	public void deletarTurma(String codigoTurma);

	public Turma pesquisarTurma(String codigoTurma);

	public List<Turma> getListaTurmas();

	// Dados da Disciplina
	public void adicionarDisciplina(Disciplina disciplina);
	
	public Disciplina editarDisciplina(Disciplina disciplina);
	
	public void deletarDisciplina(String codigoDisciplina);
	
	public Disciplina pesquisarDisciplina(String codigoDisciplina);
	
	public List<Disciplina> getListaDisciplinas();
	
	// Dados da Prática
	public void adicionarPratica (Pratica pratica);
	
	public Pratica editarPratica (Pratica pratica);
	
	public void deletarPratica (int pratica);
	
	public Pratica pesquisarPratica (int pratica);
	
	public List<Pratica> getListaPraticas();
	
}
