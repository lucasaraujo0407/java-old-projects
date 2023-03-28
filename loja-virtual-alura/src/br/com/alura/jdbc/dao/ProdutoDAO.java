package br.com.alura.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.jdbc.Database;
import br.com.alura.jdbc.modelo.Produto;

public class ProdutoDAO {
	
	public final Connection connection;

	public ProdutoDAO(Connection connection) {		
		this.connection = connection;
	}

	public void salva(Produto produto) throws SQLException {
		
			String sql = "insert into produto (nome, descricao) VALUES (?, ?)";
			try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

				statement.setString(1, produto.getNome());
				statement.setString(2, produto.getDescricao());
				statement.execute();
				
				try (ResultSet resultSet = statement.getGeneratedKeys()) {
					if(resultSet.next()){
						String id = resultSet.getString("GENERATED_KEY");
						produto.setString(id);
						//System.out.println(id);						
					}
				}
			}
		}
	
	public List<Produto> lista() throws SQLException {
		List<Produto> produtos = new ArrayList<>();
		String sql = "SELECT * FROM produtos";
		
		try(PreparedStatement statement = connection.prepareStatement(sql)){
			statement.execute();
			transformaResultadoEmProdutos(statement, produtos);
		}
		return produtos;
		
	}

	private void transformaResultadoEmProdutos(PreparedStatement statement, List<Produto> produtos) throws SQLException {
		try(ResultSet resultSet = statement.getResultSet()){
			while(resultSet.next()) {
				int id = resultSet.getInt("id");
				String nome = resultSet.getString("nome");
				String descricao = resultSet.getString("descricao");
				Produto produto = new Produto(nome, descricao);
				produto.setId(id);
				produtos.add(produto);
			}
		}
		
	}
}