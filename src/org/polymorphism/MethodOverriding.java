package org.polymorphism;
/*2.Method Overriding : Whenever u r not satisfied with ur business logic of ur parent class method, you can create a same method
 * with same arguments in ur child class. When u create object for child class and if u call the method only child class method will get preference
 * So u r overriding parent class method with child class method
 * 
 */
//Child Class
public class MethodOverriding extends parent {
	@Override
	void discountForToys(String toyName) {
		
		System.out.println("Discount for "+ toyName+" is 20%");
	}
	public static void main(String[] args) {
		MethodOverriding m = new MethodOverriding();
		m.discountForToys("Speaking Parrot");
	}
}
//parent class 
class parent{
	
	void discountForToys(String toyName) {
		System.out.println("Discount for "+ toyName+" is 25%");
	}
}
