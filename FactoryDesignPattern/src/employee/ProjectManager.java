package employee;
import company.*;

public class ProjectManager extends Employee {

	@Override
	public void responsibilities() {
		System.out.println("A Project Manager has to Manage the Team");
	}

}