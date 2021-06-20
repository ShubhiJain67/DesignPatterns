package responsibilities;

import entities.Account;

public interface IAccountTransactions {
	void withdraw(Account account, double amount);
	void deposit(Account account, double amount);
}