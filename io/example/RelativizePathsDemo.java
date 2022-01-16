package io.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizePathsDemo {

	public static void main(String[] args) {
		Path p1 = Paths.get("/home/moises/JavaProgramming/IO/Logs/errorLogs.txt");
		Path p2 = Paths.get("/home/moises/JavaProgramming/IO");
		Path p3 = p2.relativize(p1);
		System.out.println(p3);
		
		/*
		System.out.println("p1.realativize(p1) ["
				+ p1.relativize(p2).toString() + "]");
		*/
		
		//Symbolic link
		//Files.createSymbolicLink(p1, target, attrs)
		//Files.createLink(p1, p1);
		//Files.readSymbolicLink(Path)
		//System.out.println(Files.isSymbolicLink(p1));
	}

}
