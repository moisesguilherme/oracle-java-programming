package strings;

import java.util.ArrayList;

public class StringManipulation {

	public static ArrayList<String> splitWords(String str) {

		ArrayList<String> words = new ArrayList<String>();

		while (str.length() > 0) {
			for (int i = 0; i < str.length(); i++) {
				if (i == str.length() - 1) {
					words.add(str.substring(0));
					str = "";
					break;
				} else if (str.charAt(i) == ' ') {
					words.add(str.substring(0, i));
					str = str.substring(i + 1);
					break;
				}
			}
		}

		return words;
	}
	
	public static void showWords(ArrayList<String> words) {
		for(String word: words)
			System.out.print(word + ", ");
	}
	
	public static void split(String str, String s) {
		String[] words = str.split(s);
		
		for(String word: words)
			System.out.print(word + ", ");		
	}
}
