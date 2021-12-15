package generics.methods;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodClass {
	
	
	public <T> void printArray(T[] array) {
		
		for( T arrayitem: array) {
			System.out.println( arrayitem );
		}
		
	}
	
	public double sumOfList(ArrayList<? extends Number> arrayList) {
		double s = 0.0;
		for(Number n: arrayList)
			s += n.doubleValue();
		
		return s;
	}
	
	
	public void printList(List<?> list) {
		for(Object elem: list)
			System.out.println(elem);
		System.out.println();
	}
		
}
