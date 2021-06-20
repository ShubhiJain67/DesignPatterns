package menu;

import java.util.List;

import restaurant.*;
import utility.Ingridient;

public class Pasta implements IFood{
	private String food = "PASTA with:";
	@Override
	public void prepareFood(List<Ingridient> ingridients) {
		System.out.println("Preparing Pasta using : " + ingridients);
		for(Ingridient ingridient : ingridients) {
			food += " " + ingridient;
		}
	}

	@Override
	public String deliverFood() {
		return "Here is your " + food;
	}

}
