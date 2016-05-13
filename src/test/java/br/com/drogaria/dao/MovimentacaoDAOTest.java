package br.com.drogaria.dao;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Caixa;
import br.com.drogaria.domain.Movimentacao;

public class MovimentacaoDAOTest {
	@Test
	@Ignore
	public void salvar() throws ParseException {
		Long codigoCaixa = 1L;
		CaixaDAO caixaDAO = new CaixaDAO();
		Caixa caixa = caixaDAO.buscar(codigoCaixa);
		
		Movimentacao movimentacao = new Movimentacao();
		
		movimentacao.setHorario(new SimpleDateFormat("HH:mm:ss dd/MM/yyyy").parse("18:55:42 24/09/2012"));
		movimentacao.setValor(new BigDecimal("1052.83"));
		movimentacao.setCaixa(caixa);
		
		MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();
		movimentacaoDAO.salvar(movimentacao);
	}
	
	@Test
	@Ignore
	public void listar() {
		MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();
		List<Movimentacao> resultado = movimentacaoDAO.listar();
		
		for(Movimentacao movimentacao : resultado) {
			System.out.println("Horário: " + movimentacao.getHorario());
			System.out.println("Valor: " + movimentacao.getValor());
			System.out.println("Caixa: " + movimentacao.getCaixa().getCodigo());
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		Long codigoMovimentacao = 3L;
		MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();
		Movimentacao movimentacao = movimentacaoDAO.buscar(codigoMovimentacao);
		
		System.out.println("Horário: " + movimentacao.getHorario());
		System.out.println("Valor: " + movimentacao.getValor());
		System.out.println("Caixa: " + movimentacao.getCaixa().getCodigo());
	}
		
	@Test
	@Ignore
	public void excluir() {
		Long codigoMovimentacao = 2L;
		MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();
		Movimentacao movimentacao = movimentacaoDAO.buscar(codigoMovimentacao);
		
		movimentacaoDAO.excluir(movimentacao);		
	}
	
	@Test
	@Ignore
	public void editar() throws ParseException {
		/*Long codigoCaixa = 1L;
		CaixaDAO caixaDAO = new CaixaDAO();
		Caixa caixa = caixaDAO.buscar(codigoCaixa);*/
		
		Long codigoMovimentacao = 1L;
		MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();
		Movimentacao movimentacao = movimentacaoDAO.buscar(codigoMovimentacao);
		
		movimentacao.setHorario(new SimpleDateFormat("HH:mm:ss dd/MM/yyyy").parse("09:48:00 04/06/2012"));
		movimentacaoDAO.editar(movimentacao);
	}
}
