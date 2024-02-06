package br.edu.uea;

public class Funcionario {

	private String nome;
	private String departamento;
	private int Matricula;
	
		Funcionario(){
			System.out.println("Funcionario sem nome");
		}
		Funcionario(String nome){
			this.nome = nome;
		}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getMatricula() {
		return Matricula;
	}
	public void setMatricula(int matricula) {
		Matricula = matricula;
	}
	
	
}
