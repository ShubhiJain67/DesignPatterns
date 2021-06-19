package house;

import java.util.*;
import utility.*;

public class Room {
	private int length;
	private int breadth;
	private RoomType type;
	private HashMap<Furniture, Integer> furniture;
	private HashMap<Appliances, Integer> appliances;
	private HashMap<Eminities, Integer> eminities;
	
	protected Room(int length, int breadth, RoomType type, HashMap<Furniture, Integer> furniture, HashMap<Appliances, Integer> appliances, HashMap<Eminities, Integer> eminities){
		this.length = length;
		this.breadth = breadth;
		this.type = type;
		this.furniture = furniture;
		this.appliances = appliances;
		this.eminities = eminities;
		System.out.println(this);
		System.out.println("___________________________________");
	}
	
	@Override
	public String toString() {
		String room = "";
		room = "Length: " + this.length + "\nBreadth: " + this.breadth + "\nRoomType: " + this.type + "\nFurnitures: " + this.furniture + "\nAppliances: " + this.appliances + "\nEminites: " + this.eminities;
		return room;
	}
}
