package br.com.cliente.model;

public class Cliente {

	private String id;

	private String nome;

	private String sobreNome;

	private int idade;

	private String telefone;

	/**
	 * Construtor Default
	 */
	public Cliente() {

	}

	/**
	 * Contrutor com parametros
	 */
	public Cliente(String id, String nome, String sobreNome, int idade, String telefone) {
		this.id = id;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNomeCompleto() {

		String nomeCompleto = "";

		if (!this.nome.equals("") && !this.sobreNome.equals("")) {
			nomeCompleto = this.nome + " " + this.sobreNome;
		}

		return nomeCompleto;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " Sobrenome: " + this.sobreNome + " Idade: " + this.idade + " Telefone: "
				+ this.telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
