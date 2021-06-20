package user;

import java.util.ArrayList;
import java.util.List;

import menu.Pasta;
import menu.Pizza;
import menu.Soup;
import utility.*;

public class Waiter {
	
	public static String pleaseGetMe(MenuItems menuItem) {
		String order = "";
		if(menuItem == MenuItems.Pasta) {
			List<Ingridient> pastaIngridients = new ArrayList<>();
			pastaIngridients.add(Ingridient.Cheese);
			pastaIngridients.add(Ingridient.Vegetable);
			pastaIngridients.add(Ingridient.Mayonnaise);
			pastaIngridients.add(Ingridient.Pepper);
			Pasta pasta = new Pasta();
			pasta.prepareFood(pastaIngridients);
			System.out.println(pasta.deliverFood());
		}
		else if(menuItem == MenuItems.Pizza) {
			List<Ingridient> pizzaIngridients = new ArrayList<>();
			pizzaIngridients.add(Ingridient.Cheese);
			pizzaIngridients.add(Ingridient.Vegetable);
			pizzaIngridients.add(Ingridient.PizzaSauce);
			Pizza pizza = new Pizza();
			pizza.prepareFood(pizzaIngridients);
			System.out.println(pizza.deliverFood());
		}
		else if(menuItem == MenuItems.Soup) {
			List<Ingridient> soupIngridients = new ArrayList<>();
			soupIngridients.add(Ingridient.Vegetable);
			soupIngridients.add(Ingridient.Salt);
			soupIngridients.add(Ingridient.Pepper);
			Soup soup = new Soup();
			soup.prepareFood(soupIngridients);
			System.out.println(soup.deliverFood());
		}
		else {
			order = "Sorry! Please order from the menu";
		}
		return order;
	}
}
