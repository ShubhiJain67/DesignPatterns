package menu;

import java.util.List;

import restaurant.*;
import utility.Ingridient;

public class Soup implements IFood{
	private String food = "Soup with:";
	@Override
	public void prepareFood(List<Ingridient> ingridients) {
		System.out.println("Preparing Soup using : " + ingridients);
		for(Ingridient ingridient : ingridients) {
			food += " " + ingridient;
		}
	}

	@Override
	public String deliverFood() {
		return "Here is your " + food;
	}

}
