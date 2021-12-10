
abstract interface InterfaceBankAccount {
	
	public final String BANK = "JavaBank";
	
	public void deposit(int amt);
	public void withdraw(int amt);
	public void getBalance();
	public String getBankName();
}
