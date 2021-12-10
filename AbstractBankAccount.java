abstract public class AbstractBankAccount {

	public final String BANK = "JavaBank";
	protected String accountName;
	protected int accountNum;
	protected int balance;

	
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

	// modifier to set the accountnumber
	public void setAccountNum(int num) {
		accountNum = num;
	}

	// modifier to set the balance
	public void setbalance(int num) {
		balance = num;
	}

	
	
	
	// make a withdrawal from the balance
	public void withdraw(int amt) {
		balance = balance - amt;
	}




	


	

}// end class AbstractBankAccount