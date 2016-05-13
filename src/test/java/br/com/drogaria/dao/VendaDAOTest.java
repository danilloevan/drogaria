package br.com.drogaria.dao;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Cliente;
import br.com.drogaria.domain.Funcionario;
import br.com.drogaria.domain.Venda;

public class VendaDAOTest {
	@Test
	@Ignore
	public void salvar() throws ParseException {
		Long codigoFuncionario = 1L;
		FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
		Funcionario funcionario = funcionarioDAO.buscar(codigoFuncionario);

		Long codigo = 3L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigo);

		Venda venda = new Venda();
		venda.setHorario(new SimpleDateFormat("HH:mm:ss dd/MM/yyyy").parse("19:05:34 24/09/2012"));
		venda.setPrecoTotal(new BigDecimal("146.24"));
		venda.setFuncionario(funcionario);
		venda.setCliente(cliente);

		VendaDAO vendaDAO = new VendaDAO();
		vendaDAO.salvar(venda);
	}

	@Test
	@Ignore
	public void listar() {
		VendaDAO vendaDAO = new VendaDAO();
		List<Venda> resultado = vendaDAO.listar();

		for (Venda venda : resultado) {
			System.out.println("Horário: " + venda.getHorario());
			System.out.println("Preço total: " + venda.getPrecoTotal());
			System.out.println("Funcionário: " + venda.getFuncionario().getCodigo());
			System.out.println("Cliente " + venda.getCliente().getCodigo());
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigoVenda = 1L;
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigoVenda);

		System.out.println("Horário: " + venda.getHorario());
		System.out.println("Preço total: " + venda.getPrecoTotal());
		System.out.println("Funcionário: " + venda.getFuncionario().getCodigo());
		System.out.println("Cliente " + venda.getCliente().getCodigo());
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigoVenda = 2L;
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigoVenda);

		vendaDAO.excluir(venda);
	}

	@Test
	@Ignore
	public void editar() {
		/*
		 * Long codigoFuncionario = 1L; FuncionarioDAO funcionarioDAO = new
		 * FuncionarioDAO(); Funcionario funcionario =
		 * funcionarioDAO.buscar(codigoFuncionario);
		 * 
		 * Long codigo = 3L; ClienteDAO clienteDAO = new ClienteDAO(); Cliente
		 * cliente = clienteDAO.buscar(codigo);
		 */

		Long codigoVenda = 1L;
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigoVenda);

		venda.setPrecoTotal(new BigDecimal("57.55"));
		vendaDAO.editar(venda);
	}
}
