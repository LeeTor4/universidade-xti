package com.xti.aula59;

public class StringToken {

	public static void main(String[] args) {
		
		String s = "XHTML; JAVA; JAVASCRIPT; SQL; SPRINGBOOT; JPA";
 
		String[] tokens = s.split(";");
		
		System.out.println(tokens.length);
		
		for(String t :  tokens) {
			System.out.println(t);
		}
	}

}
