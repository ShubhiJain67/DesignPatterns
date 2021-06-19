package company;

import java.util.*;

import utility.SkillSet;

public abstract class Employee {
	int employeeID;
	String name;
	int yearsOfExperience;
	List<SkillSet> skills;
	String address;
		
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String employee = "";
		employee = "ID : " + employeeID + "\nName : " + name + "\nExperience : " + yearsOfExperience;
		return employee;
	}
	
	public abstract void responsibilities();
}