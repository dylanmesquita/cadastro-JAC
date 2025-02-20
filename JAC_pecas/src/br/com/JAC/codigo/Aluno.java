package br.com.JAC.codigo;

public abstract class Aluno extends Pessoa{
	private String matricula;
	private String curso;
	private int periodo;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	
	public Aluno() {}
	
	public Aluno(String nome, int idade, String matricula, String curso, int periodo) {
		super(nome, idade);
		this.curso = curso;
		this.matricula = matricula;
		this.periodo = periodo;
	}
}
