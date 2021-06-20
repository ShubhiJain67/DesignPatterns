package entities;

import responsibilities.IAccountTransactions;

public class AccountTransactions implements IAccountTransactions{
	
	@Override
	public void withdraw(Account account, double amount) {
		if(account != null && amount > 0) {
			if(account.getAmount() >= amount) {
				account.setAmount(account.getAmount() - amount);
			}
			else{
				System.out.println("Sorry you have insufficient balance!!");
			}
		}
		System.out.println("Unexpected Error Occuered!");
	}

	@Override
	public void deposit(Account account, double amount) {
		if(account != null && amount > 0) {
			account.setAmount(account.getAmount() + amount);
		}
		System.out.println("Unexpected Error Occuered!");		
	}
}