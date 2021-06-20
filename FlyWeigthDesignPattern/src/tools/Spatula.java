package tools;

import bakery.Cake;
import utility.*;

public class Spatula implements IDecorator{
	private final String company;
	private final String model;
	private DecorationStyle decorationStyle;
	
	public Spatula(String company, String model) {
		this.company = company;
		this.model = model;
	}
	@Override
	public void decorate(Cake cake) {
		System.out.println("Decorating " + cake.getFlavor() + " cake with " + this.decorationStyle + " Ganache");
	}
	
	public void setAttachement(DecorationStyle decorationStyle) {
		this.decorationStyle = decorationStyle;
	}
	@Override
	public String toString() {
		return this.company + "'s " + this.model + " Spatual with " + this.decorationStyle + " attachement";
	}
}
