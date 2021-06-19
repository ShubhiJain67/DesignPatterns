package user;

import house.*;
import utility.*;

public class Contractor {
	public static void main(String[] args) throws CloneNotSupportedException {
		RoomBuilder builder = new RoomBuilder();
		Room room1 = builder.Build();
		builder.addFurniture(Furniture.Bed, 1);
		builder.addAppliance(Appliances.AirConditioner, 1);
		Room room2 = (Room)room1.clone();		
		System.out.println(room1);
		System.out.println(room2);
	}
}