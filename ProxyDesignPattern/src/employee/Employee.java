package employee;

import entities.*;
import responsibilities.*;
import utility.*;

public class Employee extends BankGenerics implements IBankResponsibilities, IAccountTransactions {
	private static int employeeCount = 0;
	private int employeeID;
	private String name;
	private int phoneNumber;
	private String address;
	private Designation designation;
	private AccountTransactions accountTransactions = null;
	private BankResponsibilities bankResponsibilities = null;

	public Employee(String name, int phoneNumber, String address, Designation designation) {
		employeeCount++;
		this.employeeID = employeeCount;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.designation = designation;
	}

	public void withdraw(User user, Account account, double amount) {
		if (this.getDesignation() == Designation.Cashier && user.getAccounts().contains(account)) {
			accountTransactions = new AccountTransactions();
			this.withdraw(account, amount);
		} else {
			System.out.println("A cachier along with the account holder can only withdraw money");
		}
	}

	@Override
	public void withdraw(Account account, double amount) {
		if (accountTransactions != null) {
			accountTransactions.withdraw(account, amount);
			accountTransactions = null;
			System.out.println("Money Withdrawn!");
		}
	}

	public void deposit(User user, Account account, double amount) {
		if (this.getDesignation() == Designation.Cashier && user.getAccounts().contains(account)) {
			accountTransactions = new AccountTransactions();
			this.deposit(account, amount);
		} else {
			System.out.println("A cachier along with the account holder can only deposit money");
		}
	}

	@Override
	public void deposit(Account account, double amount) {
		if (accountTransactions != null) {
			accountTransactions.deposit(account, amount);
			accountTransactions = null;
			System.out.println("Money Depositied!");
		}
	}

	@Override
	public boolean addUser(String name, int phoneNumber, String address) {
		boolean status = false;
		if (this.getDesignation() == Designation.Admin) {
			bankResponsibilities = new BankResponsibilities();
			status = bankResponsibilities.addUser(name, phoneNumber, address);
			System.out.println("User Added!");
			bankResponsibilities = null;
		} else {
			System.out.println("Only Admins can Add User");
		}
		return status;
	}

	@Override
	public boolean removeUser(User user) {
		boolean status = false;
		if (this.getDesignation() == Designation.Admin) {
			bankResponsibilities = new BankResponsibilities();
			status = bankResponsibilities.removeUser(user);
			bankResponsibilities = null;
			System.out.println("User Removed");
		} else {
			System.out.println("Only Admins can Remove User");
		}
		return status;
	}

	@Override
	public boolean addAccount(User user) {
		boolean status = false;
		if (this.getDesignation() == Designation.Admin || this.getDesignation() == Designation.Manager) {
			bankResponsibilities = new BankResponsibilities();
			status = bankResponsibilities.addAccount(user);
			bankResponsibilities = null;
			System.out.println("Account Added");
		} else {
			System.out.println("Only Admins or Managers can Add Account");
		}
		return status;
	}

	@Override
	public boolean removeAccount(int accountNumber) {
		boolean status = false;
		if (this.getDesignation() == Designation.Admin || this.getDesignation() == Designation.Manager) {
			bankResponsibilities = new BankResponsibilities();
			status = bankResponsibilities.removeAccount(accountNumber);
			bankResponsibilities = null;
			System.out.println("Account Removed");
		} else {
			System.out.println("Only Admins or Managers can Remove Account");
		}
		return status;
	}

	// Getters and Setters

	public Designation getDesignation() {
		return designation;
	}

	public void setDesignation(Designation designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String employee = "";
		employee = "\nEmployee ID: " + this.employeeID + "\nName: " + this.name + "\nPhone Number: " + this.phoneNumber
				+ "\nAddress: " + this.address + "\nDesignation: " + this.designation + "\n";
		return employee;
	}
}