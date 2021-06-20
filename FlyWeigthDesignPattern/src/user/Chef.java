package user;

import bakery.*;
import tools.IDecorator;
import utility.*;

public class Chef {
	public static void main(String[] args) {
		Cake chocolateCake = new Cake(Flavor.Chocolate, DecorationItem.Cream, DecorationStyle.Curvy);
		Cake vanillaCake = new Cake(Flavor.Vanilla, DecorationItem.Sprinkllers, DecorationStyle.Spiral);
		IDecorator chocolateCakeDecorator = ToolFactory.getEmployee(chocolateCake.decorationItem);
		chocolateCakeDecorator.setAttachement(chocolateCake.decorationStyle);
		chocolateCakeDecorator.decorate(chocolateCake);
		
		IDecorator vanillaCakeDecorator = ToolFactory.getEmployee(vanillaCake.decorationItem);
		vanillaCakeDecorator.setAttachement(vanillaCake.decorationStyle);
		vanillaCakeDecorator.decorate(vanillaCake);
	}
}