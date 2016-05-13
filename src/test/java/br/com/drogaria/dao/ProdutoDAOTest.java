package br.com.drogaria.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Fabricante;
import br.com.drogaria.domain.Produto;

public class ProdutoDAOTest {
	@Test
	@Ignore
	public void salvar() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = new Produto();

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(new Long(2));

		produto.setDescricao("CentroMIL - Suplemento de Vitaminas e Minerais");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("33.33"));
		produto.setQuantidade(new Short("1"));

		produtoDAO.salvar(produto);
	}

	@Test
	@Ignore
	public void listar() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> resultado = produtoDAO.listar();

		for (Produto produto : resultado) {
			System.out.println("Código: " + produto.getCodigo());
			System.out.println("Descrição: " + produto.getDescricao());
			System.out.println("Fabricante: " + produto.getFabricante().getDescricao());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQuantidade());
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 2L;

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);

		System.out.println("Código: " + produto.getCodigo());
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Fabricante: " + produto.getFabricante().getDescricao());
		System.out.println("Preço: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 3L;

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);

		produtoDAO.excluir(produto);
	}

	@Test
	@Ignore
	public void editar() {
		Long codigoProduto = 2L;
		Long codigoFabricante = 3L;

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigoProduto);

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigoFabricante);

		produto.setDescricao("CentroMil - Suplemento de vitaminas e minerais");
		produto.setFabricante(fabricante);

		produtoDAO.editar(produto);
	}
}
