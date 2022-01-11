package regularexpressions;

public class regularexpressionexample {

	public static void main(String[] args) {
		/*if(getAnimal("dog"))
		   System.out.println("This is a Valid Animal");
		else
		   System.out.println("This is a Valid Animal");
		*/

		//String str = "0a";
		//System.out.println(viewIfMatch(str));
		//System.out.println(numberFollowedWithAnyCharacter(str));
		
		String code = "K1234512345";
		System.out.println(isValidCode(code));
		
	}
	
	public static boolean getAnimal(String animal) {
		//return animal.matches("cat|dog|duck");
		return animal.matches("[Cc]at|[Dd]og");
	}
	
	public static boolean viewIfMatch(String str) {
		//space before 0
		return str.matches("[ 0-9a-zA-Zbcde]");
	}
	
	public static boolean numberFollowedWithAnyCharacter(String str) {
		return str.matches("[0-9].");
	}
	
	public static boolean isValidCode(String str) {
		//Valid Code: K1234512345
		//. any character in regular expressions
		//? O or 1 occurrence 
		//{10} sequencia de 10 digitos de [0-5]
		return str.matches(".?[0-5]{10}");
	}

}
