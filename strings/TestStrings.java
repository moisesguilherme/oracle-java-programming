package strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TestStrings {

	public static void main(String[] args) {
		
		
		String str = "Sample String";
		
		/*
		for(int index=0; index<str.length(); index++) {
			System.out.print(str.charAt(index));
		}*/
		
		//ArrayList<String> words = StringManipulation.splitWords(str);
		//StringManipulation.showWords(words);
		
		StringManipulation.split(str, "S");	
	}

}
