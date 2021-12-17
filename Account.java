
//Anteriormente pegava a interface: 
//public class Account implements InterfaceBankAccount
public class Account extends AbstractBankAccount{
		
		private int bonusValue;
		private AccountType type;
	    
	    //overloaded constructor for Account
	    public Account(String name, int num, int amt, AccountType type)
	    {
	            
	    	super(name, num, (amt  + calculateInitialBonusValue(amt)));
	    	bonusValue = calculateInitialBonusValue(amt);
			this.type = type;
	    }
	    
	    
	    //make a deposit to the balance
	    public void deposit(int amt)
	    {
	    	if(amt>100)    
	    		balance=balance+(amt + (int)(bonusValue * 0.1));
	    	else
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
	    
	   @Override
	   public String toString() {
		   return "\nAccount Type : " + this.type +
				   super.toString();
	   }
	   
	    
	}