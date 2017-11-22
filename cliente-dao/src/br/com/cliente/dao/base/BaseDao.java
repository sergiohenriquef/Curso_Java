package br.com.cliente.dao.base;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.cliente.dao.IDefaultDao;

public abstract class BaseDao implements IDefaultDao {

	protected Connection conexao;

	public BaseDao(Connection conexao) {
		this.conexao = conexao;
	}
	
	public void fecharConexao() throws SQLException {
		if (conexao != null) {
			conexao.close();
		}
	}
	
}
