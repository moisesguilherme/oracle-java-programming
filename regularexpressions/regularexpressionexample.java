package regularexpressions;

public class regularexpressionexample {

	public static void main(String[] args) {
		/*if(getAnimal("dog"))
		   System.out.println("This is a Valid Animal");
		else
		   System.out.println("This is a Valid Animal");
		*/
		String str = "9a";
		System.out.println(viewIfMatch(str));
		
		System.out.println(anyCharacter(str));
	}
	
	public static boolean getAnimal(String animal) {
		//return animal.matches("cat|dog|duck");
		return animal.matches("[Cc]at|[Dd]og");
	}
	
	public static boolean viewIfMatch(String str) {
		//space before 0
		return str.matches("[ 0-9a-zA-Zbcde]");
	}
	
	public static boolean anyCharacter(String str) {
		return str.matches("[0-9].");
	}

}
