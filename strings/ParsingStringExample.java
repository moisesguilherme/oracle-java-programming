package strings;

import java.util.ArrayList;
import java.util.Collections;

public class ParsingStringExample {

	public static void main(String[] args) {
		String str = "Parse this String";
		
		ArrayList<String> words = new ArrayList<String>();
		
				
		while(str.length() > 0) {
			for(int i=0; i<str.length(); i++) {
				if(i==str.length()-1) {
					words.add(str.substring(0));
					str = "";
					break;
				}
				else if(str.charAt(i) == ' ') {
					words.add(str.substring(0, i));
					str=str.substring(i+1);
					break;
				}
			}
		}
		
	  for(String s: words)
		System.out.println(s + ' ');
		

	  System.out.println("\nThere are " + words.size()
	  			+ " words in the original String");
	  
	  Collections.sort(words);
	  System.out.println(words);
	  
	}

}
