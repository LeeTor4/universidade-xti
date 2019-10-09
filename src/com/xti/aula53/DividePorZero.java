package com.xti.aula53;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean continua = true;
		//InputMismatchException
		//ArithmeticException
		
		do {
			
			try {
				
				System.out.print("Entre com o numero ");
				int a = scanner.nextInt();
				System.out.print("Entre com o divisor ");
				int b = scanner.nextInt();
		
				System.out.println(a/b);
				scanner.close();
				
				continua = false;
			}catch(InputMismatchException e) {
				System.err.println("Os numeros devem ser inteiros");
				scanner.nextLine(); // descarta o erro e libera para o usuario
			}catch(ArithmeticException e) {
				System.err.println("O divisor deve ser diferente de zero");
			}finally {
				System.out.println("Finally executado");
				
			}
			
			
		}while(continua);
		
	}

}
