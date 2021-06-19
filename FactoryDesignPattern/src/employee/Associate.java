package employee;
import company.*;

public class Associate extends BugResolver{

	@Override
	public void responsibilities() {
		System.out.println("An Associate has to resolve Major Bugs");
	}
	
}