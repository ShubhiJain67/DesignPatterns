package user;

import utility.*;

public class Customer {
	public static void main(String[] args) {
		System.out.println(Waiter.pleaseGetMe(MenuItems.Pasta));
		System.out.println(Waiter.pleaseGetMe(MenuItems.Pizza));
		System.out.println(Waiter.pleaseGetMe(MenuItems.Soup));
	}
}
