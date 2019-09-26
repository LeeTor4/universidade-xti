package com.algaworks.aula93;

public class PingPong extends Thread{
	
	public String palavra;
	public long tempo;
	
	public PingPong(String palavra, long tempo) {
		
		this.palavra = palavra;
		this.tempo   = tempo;
	}
	
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
				
           new PingPong("Ping", 1500).start();
           new PingPong("Pong", 2500).start();
	}

}
