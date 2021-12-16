package collections.exemple.arraylist.classlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Student {

	public static void main(String[] args) {
		
		ArrayList<String> studentNames = new ArrayList<String>();
				
		
		/*
		addStudents(studentNames);
		dispalyStudents(studentNames);
		Collections.sort(studentNames); 
		dispalyStudents(studentNames);
		*/
		
		
		Set<String> notDuplicate = new HashSet<String>();
		
		
		notDuplicate.add("Moisés");
		notDuplicate.add("Moisés");
		
		dispalyStudents2(notDuplicate);

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
	
	static void dispalyStudents2(Set<String> studentNames) {
		
		for(String name: studentNames) {
			System.out.println("Student Name: " + name);
		}
	}
	
}
