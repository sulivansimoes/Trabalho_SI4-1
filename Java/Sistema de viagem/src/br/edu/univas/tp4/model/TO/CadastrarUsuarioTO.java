package br.edu.univas.tp4.model.TO;

public class CadastrarUsuarioTO {

	private int codUsuario;
	private String nome;
	private int cpf;
	private String senha;
	
	
	public CadastrarUsuarioTO(){
		
	}
	
	public CadastrarUsuarioTO(int codUsuario, String nome, int cpf, String senha){
		this.codUsuario = codUsuario;
		this.nome = nome;
		this.cpf = cpf;
		this.senha = senha;
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	

}
