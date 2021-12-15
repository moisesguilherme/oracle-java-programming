package generics.wildcards;

import java.util.ArrayList;

public class unbounded {

	public static void main(String[] args) {
		//<?>
		
		ArrayList<String> array1 = new ArrayList<>();
		array1.add("Moisés");
		array1.add("Guilherme");
		
		ArrayList<Number> array2 = new ArrayList<>();
		array2.add(1);
		array2.add(2);
		
		
		imprimir(array1);
		imprimir(array2);

	}
	
	public static void imprimir(ArrayList<?> arrayListQualquer) {
		for(Object item: arrayListQualquer) {
			System.out.println("Item: " + item);
		}
				
	}

}
