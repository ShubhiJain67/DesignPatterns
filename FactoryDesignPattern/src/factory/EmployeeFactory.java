package factory;

import company.BugResolver;
import company.Employee;
import employee.*;
import utility.BugType;

public class EmployeeFactory {
	
	public static Employee getEmployee(BugType bug) {
		BugResolver emp = null;
		if(bug == BugType.Blocker) {
			emp = new ProjectLead();
		}
		else if(bug == BugType.Major) {
			emp = new Associate();
		}
		else if(bug == BugType.Minor) {
			emp = new JuniorAssociate();
		}
		else if(bug == BugType.Severe) {
			emp = new SeniorAssociate();
		}
		else if(bug == BugType.Design) {
			emp = new Designer();
		}
		else if(bug == BugType.Requirement) {
			emp = new BusinessAnalyst();
		}
		return emp;
	}
}
