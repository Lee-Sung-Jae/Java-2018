public class Account32 {
	private int regNumber, balance;
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(int balance) {
		if (balance < 0)
			this.balance = 0;
		else
			this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
}
