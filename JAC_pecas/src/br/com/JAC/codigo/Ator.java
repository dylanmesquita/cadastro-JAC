package br.com.JAC.codigo;

public class Ator extends Aluno{
	private String personagem;

	public Ator(String personagem, String nome, int idade, String matricula, String curso, int periodo){
		super(nome, idade, curso, matricula, periodo);
		this.setPersonagem(personagem);
	}

	
	public String getPersonagem() {
		return personagem;
	}

	public void setPersonagem(String personagem) {
		this.personagem = personagem;
	}
	
	
	
	
	}
