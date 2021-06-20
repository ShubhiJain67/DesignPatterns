package entities;

import java.util.*;

public class Bank{
	private static Bank bank = null;
	protected List<Account> accounts;
	protected List<User> users;
	
	private Bank() {
		this.accounts = new ArrayList<>();
		this.users = new ArrayList<>();
	}
	
	public static Bank getBank() {
		if(bank == null) {
			synchronized (Bank.class) {
				if(bank == null) {
					bank = new Bank();
				}
			}
		}
		return bank;
	}

}