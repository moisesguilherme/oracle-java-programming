package collections.sorting.examples;

import java.awt.DisplayMode;

public class SortExample {

	public static void main(String[] args) {
		int[] numbers = {40, 7, 59, 4, 1};
		displayValues(numbers);
		//sequentialSearch(numbers, 13);
		//sequentialSearch(numbers, 7);
		//binarySearch(numbers, 7);
		selectionSort(numbers);
		displayValues(numbers);
		int found = binarySearch(numbers, 7);
		if(found != -1)
			System.out.println("The value is found at position " + found);
		else
			System.out.println("The value is not found");

		//bubbleSort(numbers);
		//displayValues(numbers);
		
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
	
	static void bubbleSort(int[] numbers) {
		boolean flag = false;
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length-1; j++) {
				if(numbers[j] > numbers[j +1]) {
					flag = true;
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
			if(!flag) {
				return;
			}
		}
	}
	
	static void displayValues(int[] numbers) {
		for(int i= 0; i< numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println("\n");
	}
	
	
	static void sequentialSearch(int[] numbers, int value) {
		for(int i = 0; i < numbers.length ; i++) {
			if(numbers[i] == value) {
				System.out.println("The number " + value + " is at position "
						+ i + " in the list");
				
				return;
			}
			
		}
		System.out.println("The number " + value + " is not in the list");
	}
	
	
	
	static public int binarySearch(int[] numbers, int value) {
		int low = 0;
		int high = numbers.length - 1;
		
		while(high >= low) {
			int middle = (low + high)/2;
			if(numbers[middle] == value) {
				return middle;
			}
			
			if(numbers[middle] < value) {
				low = middle + 1;
			}
			if(numbers[middle] > value) {
				high = middle - 1;
			}
		}
		return -1;
	}

}
