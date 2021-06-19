package singleton;

import abstracts.LogGenerator;

public class EagerCreation extends LogGenerator{
	private static EagerCreation instance = new EagerCreation();
	private static int instanceCount = 1;
	static {
		System.out.println("Creating an Instance : " + instanceCount);
		System.out.println("_________________________________________");
	}
	private EagerCreation() {}
	
	public static EagerCreation getInstance() {
		return instance;
	}

	@Override
	public void getInstanceCount() {
		System.out.println("Current Instance Count: " + instanceCount);
	}
}