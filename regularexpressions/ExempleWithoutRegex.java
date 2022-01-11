package regularexpressions;

public class ExempleWithoutRegex {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("cat dog and ducks");
		
		//System.out.println(str.equals("cat"));
		
		String str2 = "cat";
		System.out.println(str2.matches("cat|dog"));

	}

}
