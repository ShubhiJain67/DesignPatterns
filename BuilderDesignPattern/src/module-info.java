module BuilderDesignPattern {
	/*
	 * Creational Design Pattern
	 * Used when there are too many arguments
	 * Argument Order and type is difficult to remember and maintain
	 * Used when we don't want to send all parameters and for rest we want default value
	 * */
	
	/*
	 * We create a static nested class which has all arguments of the outer class
	 * Builder class will have a public constructor
	 * the constructor will have necessary objects as the parameters
	 * Others will be taken care by setters
	 * build() method will return final Object
	 * */
}