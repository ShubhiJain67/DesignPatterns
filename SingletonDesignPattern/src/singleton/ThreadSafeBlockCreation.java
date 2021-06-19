package singleton;

import abstracts.LogGenerator;

public class ThreadSafeBlockCreation extends LogGenerator{
	private static ThreadSafeBlockCreation instance;
	private static int instanceCount = 0;
	
	private ThreadSafeBlockCreation() {}
	
	public static ThreadSafeBlockCreation getInstance() {
		if(instance == null) {
			synchronized (ThreadSafeMethodCreation.class) {
				if(instance == null) {
					instance = new ThreadSafeBlockCreation();
					instanceCount++;	
					System.out.println("Creating an Instance : " + instanceCount);
					System.out.println("_________________________________________");
				}
			}
		}
		
		return instance;
	}

	@Override
	public void getInstanceCount() {
		System.out.println("Current Instance Count: " + instanceCount);
	}
}
