package br.com.JAC.codigo;

public abstract class Diretor extends Aluno{
	public Diretor() {}
	
	public Diretor(String nome, int idade, String matricula, String curso, int periodo) {
		super(nome, idade, matricula, curso, periodo);
	}
	
	@Override
	public String exibirPessoa() {
		return "nome do diretor: "+getNome()+"\n curso: "+ getCurso()+" P"+getPeriodo();
	}
}
