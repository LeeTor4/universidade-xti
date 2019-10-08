package com.xti.aula60;

public class StringMutavel {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Java");

		System.out.println(sb.length() + " " + sb.toString() + " " + sb.capacity());
		//System.out.println(sb.reverse());
		
		sb.append(" trabalhando ");
		char[] c = {'c','o','m'};
		sb.append(c).append(" textos.");
		System.out.println(sb);
	
	
	
	}

}
