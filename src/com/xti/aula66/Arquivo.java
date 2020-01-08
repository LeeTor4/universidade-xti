package com.xti.aula66;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arquivo {
	
	private static Charset utf8 = StandardCharsets.ISO_8859_1;
	
	public static void main(String[] args) {
		
		Path dir = Paths.get("C:/Users/flaragao/Documents/FARMACIA-LOJA03/SPED/2019");

		/*LISTAR O CONTEÚDO*/
		try (DirectoryStream<Path> stream =  Files.newDirectoryStream(dir)){
			
			for(Path path : stream) {				
				//System.out.println(path.toAbsolutePath().toString());
				captura(path.toAbsolutePath().toString());
				//System.out.println(captura(path.toAbsolutePath().toString()));
				 System.out.println(captura(path.toAbsolutePath().toString()));		
				
			} 
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static String captura(String caminho){
		//List<String> lista = new ArrayList<String>();
		String ret = "";
		Path path = Paths.get(caminho);
		try(BufferedReader reader = Files.newBufferedReader(path,utf8)) {
			
			String line = null;
			while((line = reader.readLine()) != null) {
				
				/*if(line.contains("|0000|")
						  && !line.contains("|9900|") && !line.contains("|E116|")) {
				 	//System.out.println(line.toString());	
				 	//lista.add(line.toString());
					ret += line.toString();
								
				}*/
				/*if(line.contains("|0190|")
						  && !line.contains("|9900|") && !line.contains("|E116|")) {
				 	//System.out.println(line.toString());	
				 	//lista.add(line.toString());
					ret += line.toString();
								
				}*/
				/*if(line.contains("|0200|")
						  && !line.contains("|9900|") && !line.contains("|E116|")) {
				 	//System.out.println(line.toString());	
				 	//lista.add(line.toString());
					ret += line.toString();
								
				}*/
				if(line.contains("|C100|")
						  && !line.contains("|9900|") && !line.contains("|E116|")) {
				 	//System.out.println(line.toString());	
				 	//lista.add(line.toString());
					ret += line.toString();
								
				}
				if(line.contains("|C170|")
						  && !line.contains("|9900|") && !line.contains("|E116|")) {
				 	//System.out.println(line.toString());	
				 	//lista.add(line.toString());
					ret += line.toString();
								
				}
			}
					
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return ret;
	}
	
	
}
