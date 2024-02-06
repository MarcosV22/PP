package br.edu.uea;

public class TesteSacarBoolean {

	public static void main(String[] args) {
		ContaBancaria minhaConta = new ContaBancaria();
		minhaConta.depositar(100);
		if (minhaConta.sacar(600)) {
			System.out.println("Saque realizado com sucesso");
			System.out.println("O Saldo atual é: "+ minhaConta.saldo);
		}else {
			System.out.println("Saldo Insuficiente");
		}
		if (minhaConta.sacar(-100)) {
			System.out.println("Saque realizado com sucesso");
		}else {
			System.out.println("Saldo insuficiente ou valor do saque negativo");
		}
	System.out.println("Saldo: "  +minhaConta.saldo);
	}
	
}
