package com.xti.aula63;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
	
	public static void armazenar(List<String> line, int totlinha) {	 
		Path path = Paths.get("C:/Users/flaragao/Documents/XTI/arquivoSistema.txt");
		//Files.newBufferedWriter(path,utf8)
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(path.toString(), true))) {			
			for(String s : line) {
				totlinha++;
			  	String[] campos = s.split("\\|");
				System.out.println(String.valueOf(totlinha).concat("|").concat(campos[1]).concat("|").concat(campos[2]).concat("|").concat(campos[3]));
			  	writer.write(String.valueOf(totlinha).concat("|").concat(campos[1]).concat("|").concat(campos[2]).concat("|").concat(campos[3]));
			    writer.newLine();
			}			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static List<String> capturaNovoArquivo(){
		List<String> lista = new ArrayList<String>();
		Path path = Paths.get("C:/Users/flaragao/Documents/XTI/ArquivoNovo.txt");
		if(Files.exists(path) ==true) {
			try(BufferedReader reader = Files.newBufferedReader(path,utf8)) {
				String line = null;
	            int totLinha = 0;						
				while((line = reader.readLine()) != null) {			
					if(line.contains("|0200|") && !line.contains("|9900|")) {
						totLinha++;					
						lista.add(String.valueOf(totLinha).concat(line.toString()));					
					}					
				}			
			}catch(IOException e) {
				e.printStackTrace();
			}	
		}
		
		return lista;
	}
	
	public static List<String> capturaArquivoSistema(){
		List<String> lista = new ArrayList<String>();
		Path path = Paths.get("C:/Users/flaragao/Documents/XTI/arquivoSistema.txt");
		try(BufferedReader reader = Files.newBufferedReader(path,utf8)) {
			String line = null;						
			while((line = reader.readLine()) != null) {			
				if(line.contains("|0200|") && !line.contains("|9900|")) {									
					lista.add(line.toString());						
				}					
			}			
		}catch(IOException e) {
			e.printStackTrace();
		}		
		return lista;
	}

	
	public static List<String> produtosNovos(){	
		 List<String> retorno = new ArrayList<>();
		 List<String> ls = new ArrayList<>();
		 for(String s : capturaArquivoSistema()){
			String[] campos1 =  s.split("\\|");
			//System.out.println("s1 " + campos1[1].concat("|").concat(campos1[2]).concat("|"));		
			ls.add(campos1[1].concat("|").concat(campos1[2]).concat("|"));
		 }		
		 for(String s2 : capturaNovoArquivo()){
			  String[] campos2 = s2.split("\\|");
	          if(ls.contains(campos2[1].concat("|").concat(campos2[2]).concat("|")) == false) {
	        	  //System.out.println(s2);
	        	  retorno.add(s2);
	          }	         
		 }
		 
		 return retorno;
	}

	
	public static List<String> capturaArquivoSped(){
		List<String> lista = new ArrayList<String>();
		Path path = Paths.get("C:/Users/flaragao/Documents/XTI/arquivoSped.txt");
		try(BufferedReader reader = Files.newBufferedReader(path,utf8)) {
			String line = null;						
			while((line = reader.readLine()) != null) {			
				if(line.contains("|0200|") && !line.contains("|9900|")) {									
					lista.add(line.toString());						
				}					
			}			
		}catch(IOException e) {
			e.printStackTrace();
		}		
		return lista;
	}
	
	
	public static int totLinhaSistema(){
		int totLinha = 0;
		List<String> lista = new ArrayList<String>();
		Path path = Paths.get("C:/Users/flaragao/Documents/XTI/arquivoSistema.txt");
		try(BufferedReader reader = Files.newBufferedReader(path,utf8)) {
			String line = null;          						
			while((line = reader.readLine()) != null) {			
				if(line.contains("|0200|") && !line.contains("|9900|")) {
					totLinha++;
					//System.out.println(line.toString());
					lista.add(String.valueOf(totLinha).concat(line.toString()));					
				}					
			}			
		}catch(IOException e) {
			e.printStackTrace();
		}		
		return totLinha;
	}
		
	public static void main(String[] args) {
		armazenar(produtosNovos(), totLinhaSistema());				
	
	   //armazenar(capturaArquivoSped(),0);
	} 

}
