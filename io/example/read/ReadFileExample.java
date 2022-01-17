package io.example.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadFileExample {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		char[] input;
		System.out.println("Enter a string: ");
		input = readEntry();
		for(int i = 0; i < input.length; i++) {
			System.out.println(">>>" + input[i]);
			if(input[i] != '\n' && input[i] != '\0') {
				sb.append(input[i]);
				
			}
		}
		System.out.println(sb.toString());		

		//System.out.println(getAge());
		//System.out.println(readFile());
	}
	
	private static String readFile() {
		try(BufferedReader br = new BufferedReader
				(new FileReader("/home/moises/JavaProgramming/employees.txt"))){
			
			StringBuilder fileContents = new StringBuilder();
			String line = br.readLine();
			while(line != null){
				fileContents.append(line);
				fileContents.append(System.lineSeparator());
				line = br.readLine();
			}
			return fileContents.toString();
		}
		catch(IOException e) {
			System.err.println(e);
		}
		return null;
	}

		
	private static char[] readEntry() {
		try {
			int c;
			StringBuffer buffer = new StringBuffer();
			c = System.in.read();
			while(c != '\n' && c != -1) {
				buffer.append((char)c);
				c = System.in.read();
			}
			char[] array = new char[buffer.length()];
			buffer.getChars(0, buffer.length(), array, 0);
			return array;
		}
		catch(IOException e) {
			return null;
		}
	}
	
	private static String readLine() {
		String line = "";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		try {
			line = in.readLine();
		}
		catch(IOException e) {
			System.err.println(e);
		}
		return line;
	}
	
	static int getAge() {
		/*
		int age =-1;
		Scanner in = new Scanner(System.in);
		try {
			System.out.print("Please enter you age: ");
			age = in.nextInt();
		}
		catch(Exception e) {
			System.err.println(e);
		}finally {
			if(in != null)
				in.close();
		}
		return age;
		*/
		
		/// with try cathc Java 7
		
		int age =-1;
		try (Scanner in = new Scanner(System.in);)
		{
			System.out.print("Please enter you age: ");
			age = in.nextInt();
		}
		catch(Exception e) {
			System.out.println(">>> entrou exception");
			System.err.println(e);
		}
		return age;
	}

}
