package br.com.cliente.dao;

import java.util.List;

import br.com.cliente.dao.exception.DaoErroTecnicoException;

public interface IDefaultDao {

	public void insert() throws DaoErroTecnicoException;

	public boolean update() throws DaoErroTecnicoException;

	public List<?> select() throws DaoErroTecnicoException;

	public boolean delete() throws DaoErroTecnicoException;

}
