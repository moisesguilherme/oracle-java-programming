package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class StudentDriver {

	public static void main(String[] args) {
		ArrayList<Student> studentNames = new ArrayList();
		
		addStudents(studentNames);
		displayStudents(studentNames);
		Collections.sort(studentNames);
		// Fez o sort pelo lastname na classe student 
		System.out.println("-- after sort --");
		displayStudents(studentNames);		
	}
	
	static void addStudents(ArrayList<Student> studentNames) {
		
		studentNames.add(new Student("Mark", "Myword", 95));
		studentNames.add(new Student("Andrew", "Apic", 45));
		studentNames.add(new Student("Beth", "Tween", 78));

	}
	
	static void displayStudents(ArrayList<Student> studentNames) {
		for(Student student: studentNames)
			System.out.println(student);
	}

}
