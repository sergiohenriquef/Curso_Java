package br.com.cliente.dao.exception;

public class DaoErroTecnicoException extends Exception {

	private static final long serialVersionUID = 5919138429695567702L;
	
	public DaoErroTecnicoException(String mensagemOpcional, Exception e) {
		super(e);
		System.out.println(mensagemOpcional);
	}

}
