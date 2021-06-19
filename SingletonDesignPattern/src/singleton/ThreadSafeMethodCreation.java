package singleton;

import abstracts.LogGenerator;

public class ThreadSafeMethodCreation extends LogGenerator{
	private static ThreadSafeMethodCreation instance;
	private static int instanceCount = 0;
	
	private ThreadSafeMethodCreation() {}
	
	// Synchronized Method so that it becomes thread safe
	public static synchronized ThreadSafeMethodCreation getInstance() {
		if(instance == null) {
			instance = new ThreadSafeMethodCreation();
			instanceCount++;	
			System.out.println("Creating an Instance : " + instanceCount);
			System.out.println("_________________________________________");
		}
		
		return instance;
	}

	@Override
	public void getInstanceCount() {
		System.out.println("Current Instance Count: " + instanceCount);
	}
	
	/*
	 * Instead of making whole block synchronized make only the creation part synchronized
	 * */
}
