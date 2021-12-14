
public class testBank {
	
	public static void main(String[] args) {
     
	// Instantiate 3 accounts
	// Using constructor with values
    Account a1 = new Account("Sanjay Gupta",11556,300, AccountType.SAVINGS);
	Account a2 = new Account("Xe Xai", 22338, 500, AccountType.SAVINGS);
	Account a3 = new Account("Ilya Mustafana", 44559, 1000, AccountType.SAVINGS);
		
	
	System.out.print(a1);
	System.out.print(a2);
	System.out.print(a3);
	
	
	//Enumerations Iteration
	for(AccountType act: AccountType.values()) {
		System.out.println("Type: " + act.name()
					+ "\nCode: " + act.getCode()
					+ "\nRate: " + act.getRate());
		}
	}
}
