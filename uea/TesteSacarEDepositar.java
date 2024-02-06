package br.edu.uea;

public class TesteSacarEDepositar {

	public static void main(String[] args) {
		
		ContaBancaria minhaConta;
		minhaConta = new ContaBancaria();
		minhaConta.nomeCliente = "Anna Maria";
		minhaConta.agencia = "0001";
		minhaConta.numeroConta = "2222-2";
		minhaConta.saldo = 350.50;
		
		
		System.out.println("O cliente é: " + minhaConta.nomeCliente);
		System.out.println("O saldo inicial é " + minhaConta.saldo);
		
		
		
		minhaConta.sacar(1200);
		System.out.println("O saldo atual é " + minhaConta.saldo);
		minhaConta.depositar(500);
		System.out.println("O saldo atual é " + minhaConta.saldo);
	} 
}
