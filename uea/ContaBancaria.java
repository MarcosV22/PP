package br.edu.uea;

public class ContaBancaria {
		
        	ContaBancaria() {
        		contador++;
        		saldo = 50;
        		}
			ContaBancaria(double saldo) {
				contador++;
				this.saldo = saldo;
	}

	    private String numeroConta;
	    private String agencia;
	    private double saldo;
	    private Cliente cliente;

	    private static int contador;
	    public int getContador() {
			return contador;
		}
	    
	    
	    
	    public double getSaldo() {
	    	return saldo;
	    }
	    public String getNumeroConta() {
			return numeroConta;
		}
		public void setNumeroConta(String numeroConta) {
			this.numeroConta = numeroConta;
		}
		public Cliente getCliente() {
			return cliente;
		}
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		public String getAgencia()  {
	    	return agencia;
	    }
	    public void setAgencia(String agencia) {
	    	this.agencia = agencia;   	
	    }
	    public String numeroConta() {
	    	return numeroConta;
	    }
	    boolean sacar(double valor) {
	    	if (saldo >= valor && valor >= 0) {
	    		saldo = saldo - valor;
		    	return true;
	    	}
	    	return false;
	    	
	    }
	    void depositar(double valor) {
	    	
	    	saldo = saldo + valor;
	    	System.out.println("Deposito Realizado");
	    	System.out.println("O valor do Deposito foi de: " + valor);
	    }
	    boolean transferir(ContaBancaria contaDestino, double valor) {
	    	
	    	if (sacar(valor)) {
	    		contaDestino.depositar(valor);
	    		return true;
	    		
	    	}
	    	return false;
	   	}
	    	
   }
