package collections.sorting.examples;

import java.awt.DisplayMode;

public class SortExample {

	public static void main(String[] args) {
		int[] numbers = {40, 7, 59, 4, 1};
		displayValues(numbers);
		selectionSort(numbers);
		displayValues(numbers);
		
	}
	
	static void selectionSort(int[] numbers) {
		int indexMin = 0;
		for(int i = 0; i< numbers.length; i++) {
			indexMin = i;
			for(int j = i + 1; j < numbers.length; j++) {
				if(numbers[j] < numbers[indexMin]) {
					indexMin = j;
				}
			}
			int temp = numbers[i];
			numbers[i] = numbers[indexMin];
			numbers[indexMin] = temp;
		}
	}
	
	static void displayValues(int[] numbers) {
		for(int i= 0; i< numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("\n");
	}

}
