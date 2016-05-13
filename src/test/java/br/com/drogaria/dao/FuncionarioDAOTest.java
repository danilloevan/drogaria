package br.com.drogaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Funcionario;
import br.com.drogaria.domain.Pessoa;

public class FuncionarioDAOTest {
	@Test
	@Ignore
	public void salvar() throws ParseException {
		Long codigoPessoa = 1L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setCarteiraTrabalho("23XXXXX-X");
		funcionario.setDataAdmissao(new SimpleDateFormat("dd/MM/yyyy").parse("05/08/2015"));
		funcionario.setPessoa(pessoa);
		
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		funcionarioDAO.salvar(funcionario);
	}
	
	@Test
	@Ignore
	public void listar() {
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		List<Funcionario> resultado = funcionarioDAO.listar();
		
		for(Funcionario funcionario : resultado) {
			System.out.println("Nº Carteira de Trabalho: " + funcionario.getCarteiraTrabalho());
			System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
			System.out.println("Nome: " + funcionario.getPessoa().getNome());
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		Long codigoFuncionario = 2L;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigoFuncionario);
		
		System.out.println("Nº Carteira de Trabalho: " + funcionario.getCarteiraTrabalho());
		System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
		System.out.println("Nome: " + funcionario.getPessoa().getNome());
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long codigoFuncionario = 2L;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigoFuncionario);
		
		funcionarioDAO.excluir(funcionario);
	}
	
	@Test
	@Ignore
	public void editar() {
		/*Long codigoPessoa = 1L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);*/
		
		Long codigoFuncionario = 3L;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigoFuncionario);
		
		funcionario.setCarteiraTrabalho("99XXXXX-X");
		funcionarioDAO.editar(funcionario);
	}
}
