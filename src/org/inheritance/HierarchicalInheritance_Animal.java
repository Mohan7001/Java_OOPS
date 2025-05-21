package org.inheritance;
//Combination of on parent and more than one child class. No interaction b/w child classes. But parent will execute mutual to all child
//parent(super class)
public class HierarchicalInheritance_Animal {
	void eat() {
    	System.out.println("This can eat food");
    }
	public static void main(String[] args) {
		Dog2 d = new Dog2();
		d.eat();
		d.bark();
		Cat c = new Cat() ;
		c.eat();
		c.meow();
	
		
	}

}
//sub class 1
class Dog2 extends HierarchicalInheritance_Animal {
	void bark(){
		System.out.println("dog Can bark");
		
	}
	
}
//subclass 2
class Cat extends HierarchicalInheritance_Animal{
	void meow() {
		System.out.println("Cat meows");
	}
}
