package com.xti.aula62;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) {
		
		//C:\Users\Lee_2\Documents\ORTOGENESE\SPED\2014
		Path path = Paths.get("C:/Users/Lee_2/Documents/ORTOGENESE/SPED/2014/SPED_201401.txt");
		System.out.println(path.getParent());
		System.out.println(path.getFileName());
		System.out.println(path.toAbsolutePath());
		
		
	}

}
