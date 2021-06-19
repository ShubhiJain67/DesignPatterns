package house;

import java.util.*;
import utility.*;

public class Room implements Cloneable{
	private final String SEPERATOR = "\n______________________________________________________________";
	private static int roomCount = 0;
	private int roomID = 0;
	private int length;
	private int breadth;
	private RoomType type;
	private HashMap<Furniture, Integer> furniture;
	private HashMap<Appliances, Integer> appliances;
	private HashMap<Eminities, Integer> eminities;
	
	protected Room(int length, int breadth, RoomType type, HashMap<Furniture, Integer> furniture, HashMap<Appliances, Integer> appliances, HashMap<Eminities, Integer> eminities){
		roomCount++;
		this.roomID = roomCount;
		this.length = length;
		this.breadth = breadth;
		this.type = type;
		this.furniture = furniture;
		this.appliances = appliances;
		this.eminities = eminities;
		System.out.println("Created new Room : " + roomCount);
	}
	
	@Override
	public String toString() {
		String room = "";
		room = "\nRoom ID: " + roomID + " ->";
		room += SEPERATOR;
		room += "\nLength: " + this.length + "\nBreadth: " + this.breadth + "\nRoomType: " + this.type + "\nFurnitures: " + this.furniture + "\nAppliances: " + this.appliances + "\nEminites: " + this.eminities;
		room += SEPERATOR;
		return room;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Room room = new Room(this.length, this.breadth, this.type, this.furniture, this.appliances, this.eminities);
		return room;
	}
}
