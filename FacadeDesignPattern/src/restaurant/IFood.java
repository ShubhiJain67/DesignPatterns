package restaurant;

import java.util.*;
import utility.*;

public interface IFood {
	void prepareFood(List<Ingridient> ingridients);
	String deliverFood();
}
