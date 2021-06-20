package bakery;

import tools.IDecorator;
import tools.Spatula;
import tools.Tube;
import utility.*;

public class ToolFactory {
	static IDecorator spatula = null;
	static IDecorator tube = null;
	static IDecorator employee = null;
	
	public static IDecorator getEmployee(DecorationItem decorationItem) {
		switch (decorationItem) {
		case Cream:
			spatula = spatula == null? new Spatula("Haawkin", "R010"): spatula;
			employee = spatula;
			break;
		case Sprinkllers:
			tube = tube == null ? new Tube("Kitcken King", "ZRQ") : tube;
			employee = tube;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + decorationItem);
		}
		return employee;
	}
}
