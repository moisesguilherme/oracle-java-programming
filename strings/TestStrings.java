package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TestStrings {

	public static void main(String[] args) {
		
		
		String str = "This is my sentence";
		
		/*
		for(int index=0; index<str.length(); index++) {
			System.out.print(str.charAt(index));
		}*/
		
		ArrayList<String> words = StringManipulation.splitWords(str);
		StringManipulation.showWords(words);
		
		System.out.print("\n");
		StringManipulation.split(str, "i");
		
		System.out.print("\n");
		StringSplit.split(str, "[ie]");
		
	}

}
