package company;

import utility.BugStatus;
import utility.BugType;

public class Bug {
	int bugID;
	String name;
	String description;
	BugType type;
	BugStatus status;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String bug = "";
		bug = "ID: " + this.bugID + "\nName: " + this.name + "\nType: " + this.type + "\nStatus: " + this.status;
		return bug;
	}
}