package strings;

public class StringExample {

	public static void main(String[] args) {
		String str = "Sample String";
		
		//displayString(str);
		displayStringBackwards(str);

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

}
