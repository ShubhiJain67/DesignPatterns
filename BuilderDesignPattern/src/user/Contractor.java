package user;

import house.RoomBuilder;
import utility.Appliances;
import utility.Furniture;

public class Contractor {
	public static void main(String[] args) {
		RoomBuilder builder = new RoomBuilder();
		builder.Build();
		builder.addFurniture(Furniture.Bed, 1);
		builder.addAppliance(Appliances.AirConditioner, 1);
		builder.Build();
	}
}
