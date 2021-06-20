package entities;

import responsibilities.IBankResponsibilities;

public class BankResponsibilities extends BankGenerics implements IBankResponsibilities{
	private Bank bank = Bank.getBank();

	@Override
	public boolean addUser(String name, int phoneNumber, String address) {
		User u = this.getUser(name, phoneNumber, address);
		if(u == null) {
			bank.users.add(new User(name, phoneNumber, address));
			return true;
		}
		System.out.println("User Already Exists! with user ID : " + u.getUserID());
		return false;
	}
	
	@Override
	public boolean removeUser(User user) {
		if(user != null) {
			bank.users.remove(user);
			return true;
		}
		System.out.println("User Doesnot Exists!");
		return false;
	}
	
	@Override
	public boolean addAccount(User user) {
		if(user != null) {
			Account account = new Account(user);
			bank.accounts.add(account);
			user.addAccount(account);
			return true;
		}
		System.out.println("User Doesnot Exists!");
		return false;
	}
	
	@Override
	public boolean removeAccount(int accountNumber) {
		User user =  getUser(accountNumber);
		if(user != null) {
			Account account = getAccount(accountNumber);
			if(account != null) {
				if(user.removeAccount(accountNumber)) {
					bank.accounts.remove(account);
					return true;					
				}
				return false;
			}
			else {
				System.out.println("Account Doesnot Exists!");
				return false;
			}
		}
		System.out.println("User Doesnot Exists!");
		return false;
	}
}