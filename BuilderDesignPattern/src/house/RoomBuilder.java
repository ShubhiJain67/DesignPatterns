package house;

import java.util.*;
import java.util.Map.Entry;

import utility.*;

public class RoomBuilder {
	private int length;
	private int breadth;
	private RoomType type;
	private HashMap<Furniture, Integer> furnitureList;
	private HashMap<Appliances, Integer> applianceList;
	private HashMap<Eminities, Integer> eminityList;
	
	public RoomBuilder() {
		this.length = 20;
		this.breadth = 30;
		this.type = RoomType.Bedroom;
		this.furnitureList = new HashMap<>(){
		    {
		        put(Furniture.Bed, 1);
		        put(Furniture.Cupboard, 1);
		        put(Furniture.Chair, 2);
		        put(Furniture.BedsideTable, 2);
		    }
		};
		this.applianceList = new HashMap<>(){
		    {
		        put(Appliances.Bulb, 1);
		        put(Appliances.TV, 1);
		    }
		};
		this.eminityList = new HashMap<>();
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public void setType(RoomType type) {
		this.type = type;
	}
	
	public void addFurniture(Furniture furniture, int count) {
		this.furnitureList.put(furniture, this.furnitureList.getOrDefault(furniture, 0) + 1);
	}
	
	public void addAllFurniture(HashMap<Furniture, Integer> furnitureList) {
		for(Entry<Furniture, Integer> furniture : furnitureList.entrySet()) {
			this.addFurniture(furniture.getKey(), furniture.getValue());
		}
	}
	
	public void addAppliance(Appliances appliances, int count) {
		this.applianceList.put(appliances, this.applianceList.getOrDefault(appliances, 0) + 1);
	}
	
	public void addAllAppliance(HashMap<Appliances, Integer> applianceList) {
		for(Entry<Appliances, Integer> appliance : applianceList.entrySet()) {
			this.addAppliance(appliance.getKey(), appliance.getValue());
		}
	}
	
	public void addEminity(Eminities eminity, int count) {
		this.eminityList.put(eminity, this.applianceList.getOrDefault(eminity, 0) + 1);
	}
	
	public void addAllEminity(HashMap<Eminities, Integer> eminityList) {
		for(Entry<Eminities, Integer> eminity : eminityList.entrySet()) {
			this.addEminity(eminity.getKey(), eminity.getValue());
		}
	}
	
	public Room Build() {
		return new Room(this.length, this.breadth, this.type, this.furnitureList, this.applianceList, this.eminityList);
	}
}
