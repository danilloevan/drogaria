package br.com.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Cidade;
import br.com.drogaria.domain.Estado;

/*
 * Falta validação. Validação será feita na própria view?
 */
public class CidadeDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Long codigoEstado = 1L;
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigoEstado);

		Cidade cidade = new Cidade();
		cidade.setNome("Cajazeiras");
		cidade.setEstado(estado);

		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.salvar(cidade);
	}

	@Test
	@Ignore
	public void listar() {
		CidadeDAO cidadeDAO = new CidadeDAO();
		List<Cidade> resultado = cidadeDAO.listar();

		for (Cidade cidade : resultado) {
			System.out.println("Código: " + cidade.getCodigo());
			System.out.println("Nome: " + cidade.getNome());
			System.out.println("Estado: " + cidade.getEstado().getNome() + " - " + cidade.getEstado().getSigla());
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 6L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);

		System.out.println("Código: " + cidade.getCodigo());
		System.out.println("Nome: " + cidade.getNome());
		System.out.println("Estado: " + cidade.getEstado().getNome() + " - " + cidade.getEstado().getSigla());
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long codigo = 5L;
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigo);
		
		cidadeDAO.excluir(cidade);
	}
	
	@Test
	@Ignore
	public void editar() {
		Long codigoCidade = 7L;
		Long codigoEstado = 4L;
		
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigoEstado);
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		Cidade cidade = cidadeDAO.buscar(codigoCidade);
		
		System.out.println("Cidade a ser editada");
		System.out.println("Código: " + cidade.getCodigo());
		System.out.println("Nome: " + cidade.getNome());
		System.out.println("Estado: " + cidade.getEstado().getNome() + " - " + cidade.getEstado().getSigla());
		
		cidade.setNome("Estrela");
		cidade.setEstado(estado);
		
		cidadeDAO.editar(cidade);
		
		System.out.println("Cidade editada");
		System.out.println("Código: " + cidade.getCodigo());
		System.out.println("Nome: " + cidade.getNome());
		System.out.println("Estado: " + cidade.getEstado().getNome() + " - " + cidade.getEstado().getSigla());
	}

}
