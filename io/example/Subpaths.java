package io.example;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Subpaths {

	public static void main(String[] args) {
		
		//Path sp = Paths.get("/home/moises/Desktop/apagar/DemoFile.txt");
		//System.out.println("p.subpath() [" + sp.getNameCount() + "][" + sp.subpath(0,5) + "]");
		//System.out.println("p.subpath() [" + sp.getNameCount() + "][" + sp.subpath(0,3) + "]");		
		
		Path sp = Paths.get("/home/moises/JavaProgramming/demoFiles.txt");
		System.out.println("sp.subpath() [" + sp.getNameCount() + "][" + sp.subpath(0,3) + "]");
		System.out.println("sp.subpath() [" + sp.getNameCount() + "][" + (sp.normalize()).subpath(0, sp.normalize().getNameCount() -1) + "]");
	}
}
