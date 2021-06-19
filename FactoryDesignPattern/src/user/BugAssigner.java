package user;

import company.Employee;
import factory.EmployeeFactory;
import utility.BugType;

public class BugAssigner {
	
	public static void main(String[] args) {
		Employee employee = EmployeeFactory.getEmployee(BugType.Major);
		employee.responsibilities();
	}
}
