package io.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileHandling {

	public static void main(String[] args) {
		// Paths.get(uri)
		// Files.newBufferedReader()
		// Charset.forName();
		//ArrayList<String> employees = new ArrayList<String>();
		//readFile(employees);
		//displayEmployees(employees);
		//writeFile(employees);
		
		FileSystem fs = FileSystems.getDefault();
		Path path = fs.getPath("/home/moises/eclipse-workspace/JavaBank/employess.txt");
		System.out.println("Default Directory [" + path + "]");

	}

	static void displayEmployees(ArrayList<String> employees) {
		for(String employee: employees)
			System.out.println(employee);
	}

	static void readFile(ArrayList<String> employees) {
		String line = "";
		Path path = Paths.get("employees.txt");
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
	
	public static void writeFile(ArrayList<String> employees) {
		Path path = Paths.get("userNames.txt");
		try {
			BufferedWriter bw = Files.newBufferedWriter(path,  
					Charset.forName("ISO-8859-1"),
					StandardOpenOption.CREATE, StandardOpenOption.WRITE);
			for(String employee: employees) {
				bw.write(employee);
				bw.newLine();
			}
			bw.close();
		}
		catch(IOException ioe){
			System.out.println("Error reading file.");
			System.exit(0);
		}
		
	}

}
