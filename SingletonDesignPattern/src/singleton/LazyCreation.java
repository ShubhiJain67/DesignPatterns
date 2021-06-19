package singleton;

import abstracts.LogGenerator;

public class LazyCreation extends LogGenerator{
	private static LazyCreation instance;
	private static int instanceCount = 0;
	
	private LazyCreation(){}
	
	public static LazyCreation getInstance() {
		if(instance == null) {
			instance = new LazyCreation();	
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
	 * Might have issue in parallel processing : when multiple threads are accessing it
	 * NOT THREAD SAFE : use SYNCHRONISED
	 * */
}