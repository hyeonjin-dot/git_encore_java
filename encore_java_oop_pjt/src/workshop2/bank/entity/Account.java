package workshop2.bank.entity;

public class Account {
	private String	custId;
	private String	custName;
	private String	accountNumber;
	private int		balance;
	
	public	Account() {}
	
	public	Account(String custId, String custName, String accountNumber, int balance) {
		this.custId = custId;
		this.custName = custName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getCustId() {
		return custId;
	}
	
	public void setCustId(String newId) {
		this.custId = newId;
	}

	public String getCustName() {
		return custName;
	}
	
	public void setCustName(String newName) {
		this.custName = newName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String newAccount) {
		this.accountNumber = newAccount;
	}

	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int newBalance) {
		this.balance = newBalance;
	}
	
	public void addBalance(int amount) {
		int bf = getBalance();
		bf += amount;
		setBalance(bf);
	}
	
	public void subtractBalance(int amount) {
		int bf = getBalance();
		bf -= amount;
		setBalance(bf);
	}

}
