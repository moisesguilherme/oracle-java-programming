package io.example;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesCheckDemo {

	public static void main(String[] args) {
		Path path = Paths.get("/home/moises/JavaProgramming/IO");
		boolean path_exists = Files.exists(path);
		
		/*
		Files.isReadable(path);
		Files.isWritable(path);
		Files.isExecutable(path);
		Files.isHidden(path);
		Files.isSameFile(path, path2);
		*/
		
		System.out.println("Exists? " + path_exists);
	}

}
