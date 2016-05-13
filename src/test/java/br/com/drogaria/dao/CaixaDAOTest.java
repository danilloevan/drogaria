package br.com.drogaria.dao;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Caixa;

public class CaixaDAOTest {
	@Test
	@Ignore
	public void salvar() throws ParseException {
		Caixa caixa = new Caixa();
		caixa.setDataAbertura(new SimpleDateFormat("dd/MM/yyyy").parse("27/04/2015"));
		caixa.setValorAbertura(new BigDecimal("255.00"));
		caixa.setDataFechamento(new SimpleDateFormat("dd/MM/yyyy").parse("28/04/2015"));
		
		CaixaDAO caixaDAO = new CaixaDAO();
		caixaDAO.salvar(caixa);
	}

	@Test
	@Ignore
	public void listar() {
		CaixaDAO caixaDAO = new CaixaDAO();
		List<Caixa> resultado = caixaDAO.listar();

		for (Caixa caixa : resultado) {
			System.out.println("Data de Abertura: " + caixa.getDataAbertura());
			System.out.println("Valor de Abertura: " + caixa.getValorAbertura());
			System.out.println("Data de Fechamento: " + caixa.getDataFechamento());
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigoCaixa = 1L;
		CaixaDAO caixaDAO = new CaixaDAO();
		Caixa caixa = caixaDAO.buscar(codigoCaixa);

		System.out.println("Data de Abertura: " + caixa.getDataAbertura());
		System.out.println("Valor de Abertura: " + caixa.getValorAbertura());
		System.out.println("Data de Fechamento: " + caixa.getDataFechamento());
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigoCaixa = 2L;
		CaixaDAO caixaDAO = new CaixaDAO();
		Caixa caixa = caixaDAO.buscar(codigoCaixa);

		caixaDAO.excluir(caixa);
	}

	@Test
	@Ignore
	public void editar() {
		Long codigoCaixa = 1L;
		CaixaDAO caixaDAO = new CaixaDAO();
		Caixa caixa = caixaDAO.buscar(codigoCaixa);

		caixa.setValorAbertura(new BigDecimal("412.00"));

		caixaDAO.editar(caixa);
	}
}
