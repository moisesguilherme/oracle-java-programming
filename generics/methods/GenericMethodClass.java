package generics.methods;

public class GenericMethodClass {
	
	
	public <T> void printArray(T[] array) {
		
		for( T arrayitem: array) {
			System.out.println( arrayitem );
		}
		
	}
}
