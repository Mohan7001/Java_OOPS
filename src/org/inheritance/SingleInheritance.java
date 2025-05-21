package org.inheritance;
//Combination of one parent and one child class. One parent class supporting into one child class
//Parent class
public class SingleInheritance extends Dog{
	private void bark() {
		System.out.println("This can bark");

	}
	public static void main(String[] args) {
		SingleInheritance s = new SingleInheritance();
		s.eat();
		s.bark();
	}
	
	
}
//child class
class Dog{
	void eat() {
		System.out.println("Dog can eat food");
	}
}
