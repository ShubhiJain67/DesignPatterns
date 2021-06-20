package entities;

public class BankGenerics {
	Bank bank = Bank.getBank();
	public Account getAccount(int accountNumber) {
		for(Account account : bank.accounts) {
			if(account.getNumber() == accountNumber) {
				return account;
			}
		}
		return null;
	}
	
	public User getUser(String name, int phoneNumber, String address) {
		for(User u : bank.users) {
			if(u.getAddress() == address && u.getName() == name && u.getPhoneNumber() == phoneNumber) {
				return u;
			}
		}
		return null;
	}
	
	public User getUser(int accountNumber) {
		for(Account account : bank.accounts) {
			if(account.getNumber() == accountNumber) {
				return account.getHolder();
			}
		}
		return null;
	}
	
}
