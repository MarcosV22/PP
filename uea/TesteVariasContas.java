package br.edu.uea;

public class TesteVariasContas {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		c1.nomeCliente = "Anna";
		c1.saldo = 500;
		
		ContaBancaria c2 = new ContaBancaria();
		c2.nomeCliente = "Lulu";
		c2.saldo = 1000;
		
		ContaBancaria c3 = c2;
		c3.depositar(250);
		System.out.println("Saldo de C2: " + c2.saldo);
		System.out.println("Saldo de C3: " + c3.saldo);
		c2.depositar(50);
		System.out.println("Saldo de C2: " + c2.saldo);
		System.out.println("Saldo de C3: " + c3.saldo);
		
	}
}
