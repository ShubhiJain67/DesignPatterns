package responsibilities;

import entities.User;

public interface IBankResponsibilities {
	boolean addUser(String name, int phoneNumber, String address);
	boolean removeUser(User user);
	boolean addAccount(User user);
	boolean removeAccount(int accountNumber);
}