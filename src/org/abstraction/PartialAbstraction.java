package org.abstraction;
//Abstraction : Hiding Implementation part or business logic
//Two Types : 1.Partial Abstraction 2.Fully Abstraction
/*1.Partial Abstraction : We can achieve through abstract class
 * Abstract Class: Contains both abstract and non abstract methods. We can't create object for abstract classes.
 * To Access methods in another class we have to use extends keyword
 */
abstract class PartialAbstraction {
	//Normal method
	void m1() {
		System.out.println("Hi Hello");
	}
	/*Abstract method
	 * Method only declared not defined
	 * There will be no business logic , their will be only templates
	 */
	abstract void m2();
		
	
	
}

