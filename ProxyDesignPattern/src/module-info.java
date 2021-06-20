module ProxyDesignPattern {
	/*
	 * Structural Design Pattern
	 * Used when you want to control access i.e In Datases
	 * you want to control the delet query to be available only tto Admin
	 * Basically it is used to add access control.
	 * */
	
	/*
	 * We have a class which executes interface executer method (executes all commands)
	 * To control this we add a proxy class which implements the same interface and
	 * writes the conditions for filterng the activities conditionally before movig to the actual executer
	 * We create a proxy object which represents our actual object and does work on the behalf of Original Object
	 * Client Doesn'tdirectly access actual object but accesses the Proxy which authorizes it and then do the required operation
	 * */
	
	/*
	 * Example Credit Card, Debit Card, DD, Cheque is Proxy to our cash in Bank
	 * */
	
	/*Types
	 * Remote Proxy : Used when you want to access a resource which exists on Remote (ifferent Server, Diff Namespace)
	 * Virtul Proxy : 
	 * Protection Proxy : 
	 * */
}