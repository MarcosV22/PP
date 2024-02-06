package br.edu.uea;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		
		ContaBancaria minhaConta;
		
		minhaConta = new ContaBancaria();
		minhaConta.cliente = new Cliente();
		minhaConta.cliente.nome = "Ana Maria";
		minhaConta.agencia = "0001";
		minhaConta.numeroConta = "2222-2";
		minhaConta.saldo = 3550.50;
		System.out.println("O cliente é: " + minhaConta.cliente.nome);
		System.out.println("O saldo atual é " + minhaConta.saldo);
	
	}
}
