package tools;

import bakery.Cake;
import utility.*;

public interface IDecorator {
	void decorate(Cake bug);
	void setAttachement(DecorationStyle attachement);
}
