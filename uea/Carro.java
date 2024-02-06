package br.edu.uea;

public class Carro {

	String cor;
	String modelo;
	double velocidadeAtual;
	double VelocidadeMaxima;
	Motor motor;
	
	void ligar() {
		System.out.println("O carro está ligado");
	}
	
	void acelerar(double quantidade) {
		this.velocidadeAtual += quantidade;
	}
	
	void freiar() {
		System.out.println("O carro está freiando");
	}
	
	void gasolina() {
		System.out.println("O carro do Anggelo está sem gasolina, liso");
	}
}