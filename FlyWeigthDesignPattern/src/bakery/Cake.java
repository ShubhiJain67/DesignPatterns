package bakery;

import utility.*;

public class Cake {
	private static int cakeCount;
	private int cakeID;
	private Flavor flavor;
	public DecorationStyle decorationStyle;
	public DecorationItem decorationItem;
	
	public Cake(Flavor flavor, DecorationItem decorationItem, DecorationStyle decorationStyle){
		cakeCount++;
		this.cakeID = cakeCount;
		this.flavor = flavor;
		this.decorationStyle = decorationStyle;
		this.decorationItem = decorationItem;
	}

	@Override
	public String toString() {
		return "Cake ID: " + this.cakeID + "\nFlavor: " + this.flavor + "\nDecoration Item: " + this.decorationItem + "\nDecoration Style: " + this.decorationStyle + "\n";
	}

	public int getCakeID() {
		return cakeID;
	}
	
	public Flavor getFlavor() {
		return flavor;
	}

	public void setFlavor(Flavor flavor) {
		this.flavor = flavor;
	}
}
