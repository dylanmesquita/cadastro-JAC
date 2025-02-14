package br.com.JAC.codigo;

public class Orientador extends Pessoa {
	private String telefone;
	private String email;

	public Orientador (String nome, int idade, String telefone, String email) {
		super(nome, idade);
		this.telefone = telefone;
		this.email = email;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
}
