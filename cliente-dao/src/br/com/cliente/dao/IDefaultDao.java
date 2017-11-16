package br.com.cliente.dao;

import java.util.List;

public interface IDefaultDao {
	
	public void insert();
	
	public boolean update();
	
	public List<?> select();
	
	public boolean delete();	

}
