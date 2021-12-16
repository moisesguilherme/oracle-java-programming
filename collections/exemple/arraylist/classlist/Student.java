package collections.exemple.arraylist.classlist;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

	public static void main(String[] args) {
		
		ArrayList<String> studentNames = new ArrayList<String>();
		
		addStudents(studentNames);
		dispalyStudents(studentNames);
		Collections.sort(studentNames); 
		dispalyStudents(studentNames);
	}

	
	static void addStudents(ArrayList<String> studentNames) {
		studentNames.add("Moisés");		
		studentNames.add("Guilherme");
		studentNames.add("Igor");
		studentNames.add("Abia");
	}
	
	static void dispalyStudents(ArrayList<String> studentNames) {
		
		for(String name: studentNames) {
			System.out.println("Student Name: " + name);
		}
	}
	
}
