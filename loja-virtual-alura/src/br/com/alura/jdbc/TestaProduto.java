package br.com.alura.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.modelo.Produto;

public class TestaProduto {

	public static void main(String[] args) throws SQLException {
		Produto produto = new Produto("Mesa azul", "Mesa azul com 4 cadeiras");
		
		try (Connection connection = Database.getConnection()){
			ProdutoDAO dao = new ProdutoDAO(connection);
			dao.salva(produto);
			
			List<Produto> produtos = dao.lista();
			for(Produto produto1 : produtos) {
				System.out.println("Existe o produto " + produto1);
			}
		}

	}

}
