
public class testCreditAccount {
	

	public static void main(String[] args) {
	     
		// Instantiate 3 accounts using constructor with values
	    Account A1 = new Account("Sanjay Gupta",11556,300);
		Account A2 = new Account("He Xai",22338, 500);
		Account A3 = new Account("Ilya Mustafana", 44559, 1000);
		
		
		// Instantiate 2 credit accounts using constructor with
		// values witch will call constructor form super
		CreditAccount C1 = new CreditAccount("A.N Other", 88776, 500);
		CreditAccount C2 = new CreditAccount("Another", 66778,1000);
		
		// Print accounts
		System.out.println(A1);
		System.out.println(A2);
		System.out.println(A3);
		System.out.println(C1);
		System.out.println(C2);
		
    }
}

