package collections.example.linkedlist;

import java.util.LinkedList;

public class LetterStack {

	public static void main(String[] args) {
		
		//STACK - pilha o primeiro que entra é o último a sair
		LinkedList<String> letterS = new LinkedList<String>();

		letterS.push("A");
		letterS.push("B");
		letterS.push("C");
		letterS.push("D");
		
		//display the contents of the linked list
		System.out.println("Linked list: " + letterS);
		
		//display the size of the linked list
		System.out.println("Stack Size: " + letterS.size());
		
		while(!letterS.isEmpty()) {
			System.out.println(letterS.pop());
		}
		
		System.out.println("Linked list : " + letterS);
	}

}
