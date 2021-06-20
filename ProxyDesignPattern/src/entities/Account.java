package entities;

public class Account {
	private static int accountCount;
	private int number;
	private User holder;
	private double amount;
	
	protected Account(User accountHolder){
		accountCount++;
		this.number = accountCount;
		this.setHolder(accountHolder);
	}
	
	public double getAmount() {
		return amount;
	}

	protected void setAmount(double d) {
		this.amount = d;
	}

	public User getHolder() {
		return holder;
	}

	protected void setHolder(User holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}
}