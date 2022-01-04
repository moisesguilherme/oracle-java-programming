package strings;

public class StringExample {

	public static void main(String[] args) {
		String str = "Sample String teste";
		
		//displayString(str);
		//displayStringBackwards(str);
		//countSpacesInString(str);
		searchString(str, 'S');

	}
	
	static void displayString(String str) {
		System.out.println(str);
		
		for(int index=0; index<str.length(); index++) {
			System.out.println(str.charAt(index));
		}
	}
	
	static void displayStringBackwards(String str) {
		String strBackwards = "";
		for(int i=str.length()-1; i >= 0; i--) {
			strBackwards += str.substring(i,i+1);
		}
		
		System.out.println(strBackwards);
	}
	
	static void countSpacesInString(String str) {
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ' ')
				count++;
		}
		
		System.out.println("Exists " + count +  " spaces in this text");
	}
	
	static void searchString(String str, char c) {
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c)
				count++;
		}
		
		System.out.println("The character " + c 
				+ " appears in the text "
				+ count + " times.");
	}

}
