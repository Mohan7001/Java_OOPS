package org.abstraction;
/* 2.Fully Abstraction : We can achieve through interface
 * Interface : Contains only abstract, static and default methods and we can't create object for interface.
 * To access in another class we have to use Implements keyword
 * By default "public abstract" is consider for each method
 * By default "static final" is considered for each variable
 * We can achieve multiple inheritance using Interface
 * we can use extends keyword if u want to access one interface properties into another interface
 * 
 */

 interface FullyAbstraction {
	
	 void Anima2 ();
		
	static void  sleep() {
		System.out.println("The animal is sleeping");
	}
default void run() {
	System.out.println("This animal is running");
}
}
  class normal implements FullyAbstraction, example2{
	public void Anima2() {
		 System.out.println("Animal2 lives in Forest");
	 }
	public void Anim3() {
		 System.out.println("Animal3 lives in Forest");
	}
	public static void main(String[] args) {
		normal n = new normal();
		n.Anima2();
		n.Anim3();
	}
 }
  interface example2{
	  void Anim3();
  }
