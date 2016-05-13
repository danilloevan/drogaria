package br.com.drogaria.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.drogaria.domain.Pessoa;
import br.com.drogaria.domain.Usuario;

public class UsuarioDAOTest {
	@Test
	@Ignore
	public void salvar() {
		Long codigoPessoa = 1L;
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);
		
		Usuario usuario = new Usuario();
		usuario.setTipo('F');
		usuario.setAtivo(true);
		usuario.setSenha("123456");
		usuario.setPessoa(pessoa);
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.salvar(usuario);
	}
	
	@Test
	@Ignore
	public void listar() {
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		List<Usuario> resultado = usuarioDAO.listar();
		
		for(Usuario usuario : resultado) {
			System.out.println("Tipo: " + usuario.getTipo());
			System.out.println("Condição: " + usuario.getAtivo());
			System.out.println("Senha: " + usuario.getSenha());
			System.out.println("Nome: " + usuario.getPessoa().getNome());
		}
	}
	
	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);
		
		System.out.println("Tipo: " + usuario.getTipo());
		System.out.println("Condição: " + usuario.getAtivo());
		System.out.println("Senha: " + usuario.getSenha());
		System.out.println("Nome: " + usuario.getPessoa().getNome());
	}
	
	@Test
	@Ignore
	public void excluir() {
		Long codigo = 2L;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigo);
		
		usuarioDAO.excluir(usuario);
	}
	
	@Test
	@Ignore
	public void editar() {
		Long codigoUsuario = 1L;
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		Usuario usuario = usuarioDAO.buscar(codigoUsuario);
		
		/*Long codigoPessoa = 1L;		
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);*/
		
		usuario.setSenha("ytrewq123456");
		
		usuarioDAO.editar(usuario);
		
	}
}
