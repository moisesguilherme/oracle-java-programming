package strings;

public class StringSplit {
		
	public static void split(String str, String token) {
		String[] tokens = str.split(token);
		
		for(String word: tokens)
			System.out.print(word + ", ");
	}
	
}
