abstract public class AbstractBankAccount {

	public final String BANK = "JavaBank";
	protected String accountName;
	protected int accountNum;
	protected int balance;
	private int bonusValue;
	
	
	//constructor for AbstractBankAccount
	public AbstractBankAccount(String name, int num, int amt){
		accountName=name;
		accountNum=num;
		balance=amt;
	}//end constructor method
	
	
	abstract public void deposit(int amt);

	public String getBankName() {
		return InterfaceBankAccount.BANK;
	}

	// accessor to get the accountname
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String name) {
		accountName = name;
	}

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int num) {
		accountNum = num;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int num) {
		balance = num;
	}

	// make a withdrawal from the balance
	public void withdraw(int amt) {
		balance = balance - amt;
	}
	
	@Override
	public String toString()
	{
		return "\n\nBank Name     : " + getBankName() +
				"\nAccount Holder : " + accountName +
				"\nAccount Number : " + accountNum + 
				"\nAccount balance: " + balance;
	}//end method toString
	

}// end class AbstractBankAccount