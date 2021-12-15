package generics.methods;

import java.util.List;

public class GenericMethodClass {
	
	
	public <T> void printArray(T[] array) {
		
		for( T arrayitem: array) {
			System.out.println( arrayitem );
		}
		
	}
	
	public void printList(List<?> list) {
		for(Object elem: list)
			System.out.println(elem);
		System.out.println();
	}
		
}
