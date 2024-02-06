package br.edu.uea;

public class TesteTransferir {

	public static void main(String[] args) {
		
		ContaBancaria c1 = new ContaBancaria();
		c1.saldo = 1000;
		System.out.println("Valor atual: " + c1.saldo);
		ContaBancaria c2 = new ContaBancaria();
		c2.depositar(1000);
		c1.transferir(c2, 200);
		System.out.println("Saldo de c1: " + c1.saldo);
		System.out.println("Saldo de c2: " + c2.saldo);
		
		if (c2.transferir(c1, 5000)) {
		System.out.println("Saldo de c1: " + c1.saldo);
		System.out.println("Saldo de c2: " + c2.saldo);
		}else {
			System.out.println("Transferencia não realizada");
		}
	}
}