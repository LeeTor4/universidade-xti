package com.xti.aula63;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Arquivo {

	private static Charset utf8 = StandardCharsets.ISO_8859_1;
	
	public static void armazenar(List<String> line) {
	
		Path path = Paths.get("C:/Users/flaragao/Documents/conta.txt");
		
		try(BufferedWriter writer = Files.newBufferedWriter(path,utf8)) {
			
			for(String s : line) {
				writer.write(s);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static List<String> captura(){
		List<String> lista = new ArrayList<String>();
		Path path = Paths.get("C:/Users/flaragao/Documents/05329222000176.txt");
		try(BufferedReader reader = Files.newBufferedReader(path,utf8)) {
			String line = null;
			while((line = reader.readLine()) != null) {
				
				if(line.contains("|0200|")) {
					System.out.println(line.toString());
					lista.add(line.toString()+"\n");
				}
				
			}
						
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	
	public static void main(String[] args) {
		armazenar(captura());		
	}

}
