package com.xti.aula93;

public class ContaConjunta {
	
	private int saldo = 100;
	
	public int getSaldo() {
		return saldo;
	}
	
	
	public synchronized void sacar(int valor, String cliente) {
		if(saldo >= valor) {
			System.out.println(cliente + " vai sacar");
			int saldoOriginal = saldo;
			try {
				System.out.println(cliente + " aguardando");
				Thread.sleep(1000); // aguardando processamento
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			saldo -= valor;
			String msg = cliente + " SACAOU " + valor
					+ " [ Saldo Original= " + saldoOriginal
					+ ", Saldo Final= " + saldo +"]";
			System.out.println(msg);
		}else {
			System.out.println("Saldo insuficiente para " + cliente);
		}
		
		
	}

}
