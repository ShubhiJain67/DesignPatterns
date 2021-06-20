package entities;

import java.util.*;

public class User {
	private static int userCount = 0;
	private int userID;
	private String name;
	private int phoneNumber;
	private String address;
	private List<Account> accounts;
	
	User(String name, int phoneNumber, String address){
		userCount++;
		this.userID = userCount;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.accounts = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	protected void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	protected void setAddress(String address) {
		this.address = address;
	}

	public int getUserID() {
		return userID;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	protected void addAccount(Account account) {
		this.accounts.add(account);
	}
	
	protected boolean removeAccount(int accountNumber) {
		for(Account account : this.accounts) {
			if(account.getNumber() == accountNumber) {
				this.accounts.remove(account);
				return true;
			}
		}
		System.out.println("User doesnot holder any Account with Account Number : " + accountNumber);
		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String user = "";
		user = "\nUser ID: " + this.userID + "\nName: " + this.name + "\nPhone Number: " + this.phoneNumber
				+ "\nAddress: " + this.address + "\n";
		return user;
	}
}