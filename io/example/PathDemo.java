package io.example;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PathDemo {

	public static void main(String[] args) {
		Path[] paths = new Path[4];
		paths[0] = Paths.get("/home/moises/Desktop/apagar/DemoFile.txt");
		paths[1] = Paths.get("home", "moises", "Desktop" , "apagar" , "DemoFile.txt");
		paths[2] = Paths.get("DemoFile.txt");
		paths[3] = Paths.get(URI.create("file:///~/DemoFile.txt"));
		
		/*for(int i = 0; i<paths.length; i++)
			System.out.println("Default File Path p[" + i + "] - " + paths[i]);
		*/
		
		System.out.println(paths[1].getFileName());
		System.out.println(paths[1].getParent());
		System.out.println(paths[1].getNameCount());
		System.out.println(paths[1].isAbsolute());
		System.out.println(paths[1].toAbsolutePath());
		System.out.println(paths[1].toUri());
		
		ArrayList<String> employees = new ArrayList<String>();
		readFile(employees, paths[1]);
		displayEmployees(employees);
	}
	
	static void readFile(ArrayList<String> employees, Path path) {
		String line = "";
		//Path path = Paths.get("employees.txt");
		try {
			BufferedReader fileInput = Files.newBufferedReader(path, Charset.forName("ISO-8859-1"));
			line = fileInput.readLine();
			while (line != null) {
				employees.add(line);
				line = fileInput.readLine();
			}
			fileInput.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		} catch (EOFException eofe) {
			System.out.println("No more line to read.");
		} catch (IOException ioe) {
			System.out.println("Error reading file.");
		}

	}
	
	static void displayEmployees(ArrayList<String> employees) {
		for(String employee: employees)
			System.out.println(employee);
	}



}
