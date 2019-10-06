package com.xti.aula66;

import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) {
		
		Path dir = Paths.get("C:/Users/Lee_2/Documents/ORTOGENESE/SPED/2014/");

		/*LISTAR O CONTEÚDO*/
		try (DirectoryStream<Path> stream =  Files.newDirectoryStream(dir)){
			
			for(Path path : stream) {
				
				System.out.println(path.getFileName());
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
