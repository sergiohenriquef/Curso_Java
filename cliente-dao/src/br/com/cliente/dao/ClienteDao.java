package br.com.cliente.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.cliente.dao.base.BaseDao;
import br.com.cliente.dao.base.FabricaDeConexao;
import br.com.cliente.dao.exception.DaoErroTecnicoException;

public class ClienteDao extends BaseDao {

	public ClienteDao(Connection conexao) {
		super(conexao);
	}

	@Override
	public void insert() throws DaoErroTecnicoException {

		try {

			System.out.println("Iniciando insert");

			PreparedStatement statement = conexao.prepareStatement("INSERT INTO "
					+ "tb_cliente (nome, ultimo_nome, idade, usuario, senha)" 
					+ "VALUES (?, ?, ?, ?, ?)");

			statement.setString(1, "Allan");
			statement.setString(2, "ta so olhando");
			statement.setInt(3, 24);
			statement.setString(4, "allanzinho");
			statement.setString(5, "123");

			statement.execute();

		} catch (Exception e) {	
			
			throw new DaoErroTecnicoException("Ocorreu um erro ao executar o Insert", e);
			
		} finally {
			
			try {
				fecharConexao();
			} catch (SQLException e) {
				throw new DaoErroTecnicoException("Erro ao fechar conexao no insert", e);
			}
		}	
		
		
	}

	@Override
	public boolean update() {
		return false;
	}

	@Override
	public List<?> select() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete() {
		// TODO Auto-generated method stub
		return false;
	}

}
