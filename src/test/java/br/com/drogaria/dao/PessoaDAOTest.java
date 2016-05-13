package br.com.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Cidade;
import br.com.drogaria.domain.Pessoa;

public class PessoaDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Long codigoCidade = 1L;
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Danillo E Cabral");
		pessoa.setCpf("049.XXX.XXX-XX");
		pessoa.setRg("2005XXXXXXXX");
		pessoa.setRua("206");
		pessoa.setNumero(new Short("113"));
		pessoa.setBairro("Nova Metrópole");
		pessoa.setCep("61658-350");
		pessoa.setComplemento("Rota 1");
		pessoa.setTelefone("3213-XXXX");
		pessoa.setCelular("(88) 99375-XXXX");
		pessoa.setEmail("nilloevan@gmail.com");
		pessoa.setCidade(cidade);
		
		pessoaDAO.salvar(pessoa);
	}
	
	@Test
	@Ignore
	public void lista() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> resultado = pessoaDAO.listar();
		
		for(Pessoa pessoa : resultado){
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("CPF: " + pessoa.getCpf());
			System.out.println("RG: " + pessoa.getRg());
			System.out.println("Rua: " + pessoa.getRua());
			System.out.println("Número: " + pessoa.getNumero());
			System.out.println("Bairro: " + pessoa.getBairro());
			System.out.println("CEP: " + pessoa.getCep());
			System.out.println("Complemento: " + pessoa.getComplemento());
			System.out.println("Telefone: " + pessoa.getTelefone());
			System.out.println("Celular: " + pessoa.getCelular());
			System.out.println("e-mail: " + pessoa.getEmail());
			System.out.println("Cidade: " + pessoa.getCidade().getNome());
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		Long codigoPessoa = 1L;
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("RG: " + pessoa.getRg());
		System.out.println("Rua: " + pessoa.getRua());
		System.out.println("Número: " + pessoa.getNumero());
		System.out.println("Bairro: " + pessoa.getBairro());
		System.out.println("CEP: " + pessoa.getCep());
		System.out.println("Complemento: " + pessoa.getComplemento());
		System.out.println("Telefone: " + pessoa.getTelefone());
		System.out.println("Celular: " + pessoa.getCelular());
		System.out.println("e-mail: " + pessoa.getEmail());
		System.out.println("Cidade: " + pessoa.getCidade().getNome());
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long codigoPessoa = 2L;
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
		
		pessoaDAO.excluir(pessoa);
	}
	
	@Test
	@Ignore
	public void editar() {
		Long codigoPessoa = 1L;
		
		/*Long codigoCidade = 1L;
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);*/
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
		
		pessoa.setNome("Danillo Evangelista Cabral");
		
		pessoaDAO.editar(pessoa);
	}
}
