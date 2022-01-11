package regularexpressions.example.replace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionsMatcher {

	public static void main(String[] args) {
		//create the pattern
		Pattern p = Pattern.compile("(J|j)ava");
		//create the initial String
		String str = "Java courses are the best! You have got to love java.";
		
		System.out.println(str);
		Matcher m = p.matcher(str);
		str = m.replaceAll("Oracle");
		System.out.println(str);
	}

}
