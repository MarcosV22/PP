package br.edu.uea;

public class TesteAcessoAtributo {
	
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(500);
		conta.setCliente(new Cliente());
		
		conta.setAgencia("22-22");
		System.out.println("A agencia é: " + conta.getAgencia());
		conta.setNumeroConta("0001");
		System.out.println("O numero da conta é: " + conta.getNumeroConta());
		
		System.out.println("O saldo é: "+conta.getSaldo());
		
		conta.getCliente().setNome("Palhetinha");
		conta.getCliente().setEmail("palheta@uea.edu.br");
		conta.getCliente().setSenha(1234);
		System.out.println(conta.getCliente().getNome());
		System.out.println(conta.getCliente().getEmail());
		System.out.println(conta.getCliente().getSenha());
		
		ContaBancaria conta2 = new ContaBancaria(250);
		System.out.println("Saldo 2: "+ conta2.getSaldo());
		
		ContaBancaria conta3 = new ContaBancaria();
		System.out.println("Saldo 3: "+ conta3.getSaldo());
		
		System.out.println("Contagem: "+ conta.getContador());
		
		
		
		
		
		
		
		
		
		
		
	}
}
