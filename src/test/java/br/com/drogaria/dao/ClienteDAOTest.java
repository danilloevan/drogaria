package br.com.drogaria.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Cliente;
import br.com.drogaria.domain.Pessoa;

public class ClienteDAOTest {
	@Test
	@Ignore
	public void salvar() throws ParseException {
		Long codigoPessoa = 1L;
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);

		Cliente cliente = new Cliente();
		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("05/03/2015"));
		cliente.setLiberado(true);
		cliente.setPessoa(pessoa);

		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);
	}

	@Test
	@Ignore
	public void listar() {
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> resultado = clienteDAO.listar();

		for (Cliente cliente : resultado) {
			System.out.println("Data do Cadastro: " + cliente.getDataCadastro());
			System.out.println("Condição: " + cliente.getLiberado());
			System.out.println("Nome: " + cliente.getPessoa().getNome());
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);

		System.out.println("Data do Cadastro: " + cliente.getDataCadastro());
		System.out.println("Condição: " + cliente.getLiberado());
		System.out.println("Nome: " + cliente.getPessoa().getNome());
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 2L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);

		clienteDAO.excluir(cliente);
	}

	@Test
	@Ignore
	public void editar() {
		/*
		 * Long codigoPessoa = 1L; PessoaDAO pessoaDAO = new PessoaDAO(); Pessoa
		 * pessoa = pessoaDAO.buscar(codigoPessoa);
		 */

		Long codigoCliente = 1L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigoCliente);

		cliente.setLiberado(false);

		clienteDAO.editar(cliente);
	}
}
