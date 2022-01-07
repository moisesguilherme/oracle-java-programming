package regularexpressions;

public class regularexpressionexample {

	public static void main(String[] args) {
		if(getAnimal("duck"))
		   System.out.println("This is a Valid Animal");
		else
		   System.out.println("This is a Valid Animal");

	}
	
	public static boolean getAnimal(String animal) {
		return animal.matches("cat|dog|duck");
	}

}
