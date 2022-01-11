package regularexpressions.example.ssn;

import java.util.Scanner;

public class SsnCheck {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String ssn;
		ssn = getSsn(in);
		//Valid number 333-33-3333
		if(validSsn(ssn))
			System.out.println(ssn + " is a valid Social Security Number!");
		else
			System.out.println("This ssn is not valid! must be in the format of (999-99-9999)");
		
		in.close();

	}
	
	static boolean validSsn(String ssn) {
		return ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}");
	}
	
	private static String getSsn(Scanner in) {
		System.out.println("Please enter your Social Security Number: ");
		return in.next();
	}

}
