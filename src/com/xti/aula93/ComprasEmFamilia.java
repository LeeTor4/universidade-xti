package com.xti.aula93;

public class ComprasEmFamilia implements Runnable{

	ContaConjunta conta = new ContaConjunta();

	
	public static void main(String[] args) {
		
		ComprasEmFamilia irAsCompras = new ComprasEmFamilia();
		new Thread(irAsCompras,"Pai").start();
		new Thread(irAsCompras,"Filha").start();
		new Thread(irAsCompras,"Mãe").start();
		new Thread(irAsCompras,"Baba").start();
	}
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		 for(int i = 0; i < 5; i++) {
			conta.sacar(20, name);
			if(conta.getSaldo() < 0) {
				System.out.println("Estourou");
			}
		 }	
	}
}
