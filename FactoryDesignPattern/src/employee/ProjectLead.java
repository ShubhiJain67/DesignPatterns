package employee;
import company.*;

public class ProjectLead extends BugResolver {

	@Override
	public void responsibilities() {
		System.out.println("A Project Lead has to resolve Blocker Bugs");
	}

}