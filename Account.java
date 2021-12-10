
//Anteriormente pegava a interface: 
//public class Account implements InterfaceBankAccount
public class Account extends AbstractBankAccount{
		
		private int bonusValue;
	    
	    //overloaded constructor for Account
	    public Account(String name, int num, int amt)
	    {
	            
	    	super(name, num, (amt  + calculateInitialBonusValue(amt)));
	    	bonusValue = calculateInitialBonusValue(amt);
	    		
	    }
	    
	    
	    //make a deposit to the balance
	    public void deposit(int amt)
	    {
	    	    balance=balance+amt;
	    }
	    
	    private static int calculateInitialBonusValue(int amt) {
			if(amt >= 1 && amt <= 100) {
				return 10; 
			}else if(amt <= 300) {
				return 20;
			}else
				return 30;
		}
	    
	    //print method 
	    public void print() {
	        System.out.println("\nBank Name      : " + getBankName() +	        		
	        				   "\nAccount Holder : " + accountName + 
	        				   "\nAccount Number : " + accountNum +
	        				   "\nAccount balance: " + balance);
	      }

	}