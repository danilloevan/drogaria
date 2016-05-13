package br.com.drogaria.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.ItemVenda;
import br.com.drogaria.domain.Produto;
import br.com.drogaria.domain.Venda;

public class ItemVendaDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Long codigo = 2L;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		
		Long codigoVenda = 1L;
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigoVenda);
		
		ItemVenda itemVenda = new ItemVenda();
		itemVenda.setProduto(produto);
		itemVenda.setQuantidade(new Short("1"));
		itemVenda.setPrecoParcial(new BigDecimal("33.33"));
		itemVenda.setVenda(venda);
		
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		itemVendaDAO.salvar(itemVenda);
	}
	
	@Test
	@Ignore
	public void listar() {
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		List<ItemVenda> resultado = itemVendaDAO.listar();
		
		for(ItemVenda itemVenda : resultado) {
			System.out.println("Produto: " + itemVenda.getProduto().getDescricao());
			System.out.println("Quantidade: " + itemVenda.getQuantidade());
			System.out.println("Preço parcial: " + itemVenda.getPrecoParcial());
			System.out.println("Venda: " + itemVenda.getVenda().getCodigo());			
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		Long codigoItemVenda = 1L;
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = itemVendaDAO.buscar(codigoItemVenda);
		
		System.out.println("Produto: " + itemVenda.getProduto().getDescricao());
		System.out.println("Quantidade: " + itemVenda.getQuantidade());
		System.out.println("Preço parcial: " + itemVenda.getPrecoParcial());
		System.out.println("Venda: " + itemVenda.getVenda().getCodigo());	
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long codigoItemVenda = 2L;
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = itemVendaDAO.buscar(codigoItemVenda);
		
		itemVendaDAO.excluir(itemVenda);
	}
	
	@Test
	@Ignore
	public void editar() {
		/*Long codigo = 2L;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigo);
		
		Long codigoVenda = 1L;
		VendaDAO vendaDAO = new VendaDAO();
		Venda venda = vendaDAO.buscar(codigoVenda);*/
		
		Long codigoItemVenda = 3L;
		ItemVendaDAO itemVendaDAO = new ItemVendaDAO();
		ItemVenda itemVenda = itemVendaDAO.buscar(codigoItemVenda);
		
		itemVenda.setPrecoParcial(new BigDecimal("32.99"));
		itemVendaDAO.editar(itemVenda);
	}
}
