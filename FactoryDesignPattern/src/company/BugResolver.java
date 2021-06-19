package company;

import java.util.*;

import utility.*;

public abstract class BugResolver extends Employee{
	private List<Bug> bugs = new ArrayList<>();
	
	public List<Bug> getAllBugs() {
		return this.bugs;
	}
	
	public void checkIfAssigned(Bug bug) {
		if(this.getAllBugs().contains(bug)) {
			System.out.println("Bug: " + bug.name + " is assigned to: " + this.name);
		}
		else{
			System.out.println("Bug: " + bug.name + " is not assigned to: " + this.name);
		}
	}
	
	public void assignBug(Bug bug) {
		this.bugs.add(bug);
	}
	
	public Bug getBugByID(int id) {
		for(Bug bug : this.bugs) {
			if(bug.bugID == id) {
				return bug;
			}
		}
		return null;
	}
	
	public List<Bug> getBugListByStatus(BugStatus status) {
		List<Bug> targetBugs = new ArrayList<>();
		for(Bug bug : this.bugs) {
			if(bug.status == status) {
				targetBugs.add(bug);
			}
		}
		return targetBugs;
	}

	public List<Bug> getBugListByType(BugType type) {
		List<Bug> targetBugs = new ArrayList<>();
		for(Bug bug : this.bugs) {
			if(bug.type == type) {
				targetBugs.add(bug);
			}
		}
		return targetBugs;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String bugs = "";
		for(Bug bug : this.bugs) {
			bugs += "\n" + bug.toString();
		}
		return bugs;
	}
}