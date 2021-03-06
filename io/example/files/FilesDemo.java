package io.example.files;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {

	public static void main(String[] args) throws IOException {
		Path dirPath = Paths.get("/home/moises/JavaProgramming/gameData");
		Path usersfilePath = Paths.get("Highscores.txt");
		Path settingsfilePath = Paths.get("Settings.txt");
		
		Path users, settings;
		users = checkFiles(dirPath, usersfilePath);
		settings = checkFiles(dirPath, settingsfilePath);
		
		if(users != null)
			displayFileStatus(users, settings);
		
		deleteFile(dirPath);
	}
	
	static Path checkFiles(Path dirPath, Path filePath){
		Path absPath = dirPath.resolve(filePath);
		try {
			if(Files.notExists(dirPath))
				Files.createDirectories(dirPath);
			
			if(Files.notExists(absPath))
				Files.createFile(absPath);
			
		}catch (IOException x) {
			System.err.println(x);
			return null;
		}
		return absPath;
	}
	
	static void displayFileStatus(Path users, Path settings) throws IOException{		
		System.out.println("Readable : " + Files.isReadable(users));
		System.out.println("Writeable : " + Files.isWritable(users));
		System.out.println("Executable :" + Files.isExecutable(users));
		System.out.println("Hidden :" + Files.isHidden(users));
		System.out.println("Same files :" + Files.isSameFile(users, settings));
	}
	
	static void deleteFile(Path filePath) {
		try {
			if(Files.deleteIfExists(filePath)) {
				Files.delete(filePath);
				System.out.println(filePath.toString() + " deleted!");
			}
			else 
			  System.out.println(filePath.toString() + " not found!");
		}catch(DirectoryNotEmptyException e) {
			System.out.println("The directory is not empty");
		}catch(IOException x) {
			System.out.println(x);
		}		
	}

}
