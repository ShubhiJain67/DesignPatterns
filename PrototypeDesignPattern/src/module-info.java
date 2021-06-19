module PrototypeDesignPattern {
	/*
	 * Creational Design Pattern
	 * Used to avoid multiple Object creation of same instance
	 * It copies the old object to new object and then user can modify it as per their needs
	 * It is used when object creation takes a lot of time and is a very heavy process
	 * */
	
	/*Implementation:
	 *  The Object we are trying to create by cloning should implement Cloneable interface
	 *  We can override clone() method to implement as per our need
	 *  We perform deep copy of the old object
	 *  Default clone method provides a shallow copy
	 * */
}