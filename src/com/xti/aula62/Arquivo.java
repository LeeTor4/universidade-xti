package com.xti.aula62;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		
		//C:\Users\Lee_2\Documents\ORTOGENESE\SPED\2014
		Path path = Paths.get("C:/Users/flaragao/Documents/XTI/texto.txt");
		System.out.println(path.getParent());
		System.out.println(path.getFileName());
		System.out.println(path.toAbsolutePath());
		
		/*CRIAÇÃO DE DIRETÓRIO*/
		Files.createDirectories(path.getParent());
		
		/*ESCREVER E LER ARQUIVOS*/
		byte[] bytes = "Meu Texto".getBytes();
		Files.write(path, bytes);
		
		byte[] retorno =  Files.readAllBytes(path);
		System.out.println(new String(retorno));
	}

}
