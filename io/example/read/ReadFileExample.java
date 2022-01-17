package io.example.read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFileExample {

	public static void main(String[] args) {
		
		String out;
		out = readEntry();
		System.out.println(out);
		
	}
	
	private static String readEntry() {
		try {
			int c;
			StringBuffer buffer = new StringBuffer();
			c = System.in.read();
			while(c != '\n' && c != -1) {
				System.out.println(">>>" + (char)c);
				buffer.append((char)c);
				c = System.in.read();
			}
			return buffer.toString().trim();
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
	
	

}
