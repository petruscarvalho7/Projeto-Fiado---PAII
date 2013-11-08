package br.com.ufpb.aps.logbook.testes;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import junit.framework.Assert;
import br.com.ufpb.aps.logbook.entidade.Aluno;
import br.com.ufpb.aps.logbook.entidade.Disciplina;
import br.com.ufpb.aps.logbook.entidade.Pratica;
import br.com.ufpb.aps.logbook.entidade.Professor;
import br.com.ufpb.aps.logbook.entidade.Turma;
import br.com.ufpb.aps.logbook.fachada.LogBookFacade;
import br.com.ufpb.aps.logbook.fachada.LogbookFachada;

public class LogBookTeste {

	LogBookFacade fachada = new LogbookFachada();

	@Before
	public void criarFacadeLogbook() {
		fachada = new LogbookFachada(); 
	}

	@Test
	public void testCrudAlunoNaoAddAluno() {
		
		Aluno a1 = new Aluno();
		a1.setNome("Luiz Fernando");
		a1.setSobrenome("Paiva");
		a1.setMatricula("80911008");
		a1.setEmail("fernando.paiva@dce.ufpb.br");
		a1.setLogin("fernandopaiva");
		a1.setSenha("12345");
		
		Assert.assertTrue(fachada.listaTodosAlunos().isEmpty());
		// CREATE ENTIDADE
		
	}
	
	@Test
	public void testAddAluno(){
		Aluno a1 = createAluno();
		Assert.assertFalse(fachada.listaTodosAlunos().isEmpty());
		Assert.assertEquals(a1, fachada.pesquisarAluno("80911008"));
		Assert.assertEquals("Luiz Fernando", fachada.pesquisarAluno("80911008").getNome());
		Assert.assertEquals("Paiva", fachada.pesquisarAluno("80911008").getSobrenome());
		Assert.assertEquals("fernando.paiva@dce.ufpb.br", fachada.pesquisarAluno("80911008").getEmail());
		
		
	}
	
	@Test
	public void testEditarAluno(){
		Aluno a1 = createAluno();
		
		// UPDATE ENTIDADE
		a1.setNome("josé");
		fachada.EditarDadosAluno(a1);
		Assert.assertFalse(fachada.listaTodosAlunos().isEmpty());
		Assert.assertEquals("josé", fachada.pesquisarAluno("80911008").getNome());
	}
	
	@Test
	public void testRemoverAluno(){
		Aluno a1 = createAluno();
		
		// REMOVE ENTIDADE
		fachada.deletarAluno("80911008");
		Assert.assertTrue(fachada.listaTodosAlunos().isEmpty());
	}
		// REMOVE ENTIDADE

	private Aluno createAluno() {
		Aluno a1 = new Aluno();
		a1.setNome("Luiz Fernando");
		a1.setSobrenome("Paiva");
		a1.setMatricula("80911008");
		a1.setEmail("fernando.paiva@dce.ufpb.br");
		a1.setLogin("fernandopaiva");
		a1.setSenha("12345");
		
		fachada.adicionarAluno(a1);
		
		return a1;
	}
		
	

	@Test
	public void testCrudProfessor() {
		
		Professor p1 = createProfessor();
		// CREATE ENTIDADE
		fachada.adicionarProfessor(p1);
		Assert.assertFalse(fachada.listaTodosProfessores().isEmpty());
		Assert.assertEquals(p1, fachada.pesquisarProfessor("60"));
		
	}
	
	@Test
	public void testEditarProfessor(){
		
		Professor p1 = createProfessor();
		fachada.adicionarProfessor(p1);
		// UPDATE ENTIDADE
		p1.setNome("joãozinho");
		fachada.editarProfessor(p1);
		Assert.assertFalse(fachada.listaTodosProfessores().isEmpty());
		Assert.assertEquals("joãozinho", fachada.pesquisarProfessor("60").getNome());
		
	}
	
	@Test
	public void testGetEntidade(){
		
		Professor p1 = createProfessor();
		fachada.adicionarProfessor(p1);
		
		// GET ENTIDADE
		Assert.assertEquals(p1, fachada.pesquisarProfessor("60"));
	}
	
	@Test
	public void testRemoveProfessor(){
		
		Professor p1 = createProfessor();
		fachada.adicionarProfessor(p1);
		
		// REMOVE ENTIDADE
		fachada.deletarProfessor("60");
	
	}
		
		
	private Professor createProfessor() {
		Professor p1 = new Professor();
		p1.setNome("Francisco");
		p1.setSobrenome("Pinto");
		p1.setCodigo("60");
		p1.setEmail("francisco@dce.ufpb.br");
		p1.setLogin("franciscop");
		p1.setSenha("54321");
		
		Assert.assertTrue(fachada.listaTodosProfessores().isEmpty());
		return p1;
	}

	@Test
	public void testCrudDisciplina() {
		
		Disciplina d1 = createDisciplina();
		// CREATE ENTIDADE
		fachada.adicionarDisciplina(d1);
		Assert.assertFalse(fachada.getListaDisciplinas().isEmpty());
		Assert.assertEquals(d1, fachada.pesquisarDisciplina("001"));
		
	}
	
	@Test
	public void testEditarDisciplina(){
		
		Disciplina d1 = createDisciplina();
		fachada.adicionarDisciplina(d1);
		
		// UPDATE ENTIDADE
		d1.setNomeDisciplina("Matemática");
		fachada.editarDisciplina(d1);
		Assert.assertFalse(fachada.getListaDisciplinas().isEmpty());
		Assert.assertEquals("Matemática", fachada.pesquisarDisciplina("001").getNomeDisciplina());
	}
	
	@Test
	public void testGetDisciplina(){
		
		Disciplina d1 = createDisciplina();
		fachada.adicionarDisciplina(d1);
		
		// GET ENTIDADE
		Assert.assertEquals(d1, fachada.pesquisarDisciplina("001"));
		
	}
	
	@Test
	public void testRemoverDisciplina(){
		
		Disciplina d1 = createDisciplina();
		fachada.adicionarDisciplina(d1);
		
		// REMOVE ENTIDADE
		fachada.deletarDisciplina("001");
		
	}
		

	private Disciplina createDisciplina() {
		Disciplina d1 = new Disciplina();
		d1.setNomeDisciplina("Português");
		d1.setCodigoDisciplina("001");
	
		Assert.assertTrue(fachada.listaTodosProfessores().isEmpty());
		return d1;
	}

	@Test
	public void testCrudTurma() {
		
		Turma t1 = createTurma();
		fachada.adicionarTurma(t1);
		
		Assert.assertFalse(fachada.getListaTurmas().isEmpty());
		Assert.assertEquals(t1, fachada.pesquisarTurma("001"));
		
	}
	
	@Test
	public void testEditarTurma(){
		
		Turma t1 = createTurma();
		fachada.adicionarTurma(t1);
		
		// UPDATE ENTIDADE
		t1.setCodigo("001");
		fachada.editarTurma(t1);
		Assert.assertFalse(fachada.getListaTurmas().isEmpty());
		Assert.assertEquals("001", fachada.pesquisarTurma("001").getCodigo());
		
	}	
	
	@Test
	public void testGetTurma(){
		
		Turma t1 = createTurma();
		fachada.adicionarTurma(t1);
		
		// GET ENTIDADE
		Assert.assertEquals(t1, fachada.pesquisarTurma("001"));
	
	}
	
	@Test
	public void testRemoveTurma(){
		
		Turma t1 = createTurma();
		fachada.adicionarTurma(t1);
		
		// REMOVE ENTIDADE
		fachada.deletarTurma("001");
		Assert.assertTrue(fachada.getListaDisciplinas().isEmpty());
		
	}
		
	private Turma createTurma() {
		Turma t1 = new Turma();
		t1.setCodigo("001");
		Assert.assertTrue(fachada.getListaTurmas().isEmpty());
		return t1;
	}

	@Test
	public void testeCrudPratica(){
		
		Pratica p = createPratica();
		
		Assert.assertFalse(fachada.getListaPraticas().isEmpty());
		
	}
	
	@Test
	
	public void testeEditarPratica(){
		
		Pratica p = createPratica();
		p.setPergunta("Testado");
		
		fachada.editarPratica(p);
		Assert.assertFalse(fachada.getListaPraticas().isEmpty());
		Assert.assertEquals("Testado", fachada.pesquisarPratica(0));
		
	}
	
	@Test
	
	public void testRemovePratica(){
		
		Pratica p = createPratica();
		
		fachada.deletarPratica(0);
		
		Assert.assertTrue(fachada.getListaPraticas().isEmpty());
		
		
	}

	private Pratica createPratica() {
		Disciplina d = createDisciplina();
		Pratica p = new Pratica("Teste", d);
		
		fachada.adicionarPratica(p);
		
		return p;
	}
	
	
	// inserir Aluno - OK
	// inserir Professor - OK
	// inserir Disciplina - OK
	// inserir Turma - OK
	// Verificar se existe Aluno - OK
	// Verificar se existe Professor - OK
	// Verificar se existe Disciplina - OK
	// Verificar se existe Turma - OK
	// Verificar se Turma tem Disciplina, Professor e Aluno
	// Verificar se Aluno tem Turma Disciplina e Professor
	// Verificar se Professor tem Aluno, Disciplina e Turma
	// Verificar se Disciplina tem Aluno, Turma, Professor
	// Verificar se Aluno consegue escrever no LogBook (Responder a Pergunta: -
	// O que aprendi hoje na aula? / - Quais sï¿½o minhas dï¿½vidas nessa aula?)
	// Verificar se Professor consegue escrever a Prï¿½tica
	// Verificar se Aluno consegue editar Perfil
	// Verificar se Professor consegue editar Perfil
	// Verificar se Professor consegue vizualizar o que o aluno escreveu no
	// Logbook
	// Verificar se Professor consegue corigir as Prï¿½ticas
	// Verificar se Professor consegue Adicionar Aluno
	// Verificar se Professor consegue Deletar Aluno
	// Verificar se Professor consegue Criar Turma
	// Verificar se Professor consegue criar Disciplina
	// Verificar se Professor consegue Deletar Turma
	// VErificar se Professor consegue Deletar Disciplina
	//
	
	@Test
	public void testeListarAlunos(){
		Aluno a1 = createAluno();
		
		Assert.assertFalse(fachada.listaTodosAlunos().isEmpty());
		
	}
	
	
}
