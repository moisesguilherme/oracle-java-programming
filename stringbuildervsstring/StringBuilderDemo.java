package stringbuildervsstring;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder str = new StringBuilder("Learning Java with Oracle");
		System.out.println("String = " + str);
		
		System.out.println("The lenght of the text ix: " + str.length());
		System.out.println("The character at the beginning is: " + str.charAt(0));
		System.out.println("The second character is: " + str.charAt(1));
		System.out.println("The position of the start of the text \"ac1\" is: " + str.indexOf("ac1"));
		System.out.println("The following text is included within the String: " + str.substring(1,4));
		
		
		//reverse
		System.out.println("reverse = " + str.reverse());
		
		//reverse again
		System.out.println("reverse = " + str.reverse());
		
		//ad Characters to the end of teh existing string
		str.append(" is fun");
		System.out.println("Appended strign = " + str);
		
		// remove "Java" of phrase
		str.delete(8,  13); 
		System.out.println("Deleted string = " + str);
		
		str.insert(8, " Java Programming");
		System.out.println("Inserted string = " + str);
		
		// replace
		str.replace(13,  25,  " String Processing");
		System.out.println("Replace string = " + str);
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("q"));
		
		System.out.println(str.indexOf("a", 7));
	}

}
