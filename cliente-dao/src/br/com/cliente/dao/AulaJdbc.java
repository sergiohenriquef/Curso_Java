package br.com.cliente.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.cliente.dao.base.FabricaDeConexao;

public class AulaJdbc {
	
	
	public static void main(String[] args) throws Exception  {
		
		System.out.println("Iniciando execucao");
		
		insert();
			
		select();	
	}
	
	private static void select() throws ClassNotFoundException, SQLException {
		
		System.out.println("Iniciando select");
		
		PreparedStatement statement = FabricaDeConexao.getConexao()
				.prepareStatement("select * from tb_cliente");
		
		ResultSet result =  statement.executeQuery();
		
		while(result.next()) {
			
			int id = result.getInt("id");
			String nome = result.getString(2);
			String sobrenome = result.getString(3);
			int idade = result.getInt(4);
			String usuario =  result.getString(5);
			String senha =  result.getString(6);
			
			System.out.println(id + " " +  nome + " " 
			+ sobrenome + " " + idade + " " + usuario + " " + senha);
			
		}
		
		FabricaDeConexao.fecharConexao();
		
	}
	
	private static void insert() throws SQLException, ClassNotFoundException    {
		
		System.out.println("Iniciando insert");
			
		PreparedStatement statement = 
						FabricaDeConexao.getConexao().prepareStatement("INSERT INTO "
						+ "tb_cliente (nome, ultimo_nome, idade, usuario, senha)"
						+ "VALUES (?, ?, ?, ?, ?)");
		
		statement.setString(1, "Allan");
		statement.setString(2, "ta so olhando");
		statement.setInt(3, 24);
		statement.setString(4, "allanzinho");
		statement.setString(5, "123");
		
		statement.execute();
		
		FabricaDeConexao.fecharConexao();		
	}
	
	
	
	
	

}















