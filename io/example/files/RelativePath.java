package io.example.files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativePath {

	public static void main(String[] args) {
		Path path1 = Paths.get("/home/moises/JavaProgramming/gameData/backup");
		Path path2 = Paths.get("/home/moises/JavaProgramming/IO/Logs");
		
		System.out.println("The relative path from \"" + path1 + "\" "
				+ "to \"" + path2 + "\" is [" + path1.relativize(path2).toString() + "]");
				

	}

}
