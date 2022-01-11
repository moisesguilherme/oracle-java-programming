package regularexpressions.example.find;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMatcherFindExample {

	public static void main(String[] args) {
		String pass = "Passw0rd";
		String pass2 = "Password";
		String pass3 = "000000";
		
		Pattern patt = Pattern.compile("[A-z]");
		System.out.println(findPattern(pass3, patt));
	}
	
	static boolean findPattern(String str, Pattern patt) {
		 Matcher match = patt.matcher(str);
		 return match.find();
	}

}
