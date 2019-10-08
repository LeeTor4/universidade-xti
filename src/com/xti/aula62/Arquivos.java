package com.xti.aula62;

import java.nio.file.Path;
import java.nio.file.Paths;


public class Arquivos {

	public static void main(String[] args) {
		
		Path p = Paths.get("C:/Users/flaragao/Documents");
		System.out.println(p.toAbsolutePath());
		System.out.println(p.getParent());
		System.out.println(p.getRoot());
	}

}
