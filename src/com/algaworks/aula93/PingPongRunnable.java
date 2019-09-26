package com.algaworks.aula93;

public class PingPongRunnable implements Runnable{
	
	public String palavra;
	public long tempo;
	
	public PingPongRunnable(String palavra, long tempo) {
		
		this.palavra = palavra;
		this.tempo   = tempo;
	}
	
	@Override
	public void run() {
		try {	
			for(int i = 0; i < 20; i++) {
				System.out.print(i +" => " + palavra + " ");
				
					Thread.sleep(tempo);
				
			}
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
				
         Runnable  ping =  new PingPongRunnable("Ping", 1500);
         Runnable  pong =  new PingPongRunnable("Pong", 2500);
         
         
         new Thread(ping, "Ping").start();
         new Thread(pong, "Pong").start();
	}

}
