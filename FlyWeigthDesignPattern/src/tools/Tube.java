package tools;

import bakery.Cake;
import utility.*;

public class Tube implements IDecorator{
	private final String company;
	private final String model;
	private DecorationStyle decorationStyle;
	
	public Tube(String company, String model) {
		this.company = company;
		this.model = model;
	}
	@Override
	public void decorate(Cake cake) {
		System.out.println("Decorating " + cake.getFlavor() + " cake with " + this.decorationStyle + " Sprinkller");
	}
	
	public void setAttachement(DecorationStyle decorationStyle) {
		this.decorationStyle = decorationStyle;
	}
	@Override
	public String toString() {
		return this.company + "'s " + this.model + " Tube with " + this.decorationStyle + " attachement";
	}
}
