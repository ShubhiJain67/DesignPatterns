package user;

import employee.*;
import entities.*;
import utility.*;

public class Client {
	public static void main(String[] args) {
		Employee admin = new Employee("Rajiv", 1234, "Delhi", Designation.Admin);
		admin.addUser("Shubhi Jain", 1234, "Dehradun");
		User user = admin.getUser("Shubhi Jain", 1234, "Dehradun");
		admin.addAccount(user);
		admin.deposit(user, user.getAccounts().get(0), 200);
		Employee cachier = new Employee("Rama", 1234, "Delhi", Designation.Cashier);
		cachier.deposit(user, user.getAccounts().get(0), 200);
		System.out.println(user);
		System.out.println(admin);
		System.out.println(cachier);
	}
}
