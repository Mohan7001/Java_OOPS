package org.polymorphism;
/*Polymorphism : Executing methods in more than one form/ task implemented in more than one way. Poly - many, Morphism - forms.
 * Types - 1. Method Overloading (Compile time polymorphism)/Static binding / Static polymorphism. 2. Method Overriding (run time polymorphism)/Dynamic binding / Dynamic polymorphism
 * 1. Method Overloading - When u have multiple methods with same method name, methods differ only based on the arguments datatype, arguments count, arguments datatype order
 */

public class MethodOverloading {
	void m1() {

	}

	void m1(int a, int b) {

	}

	void m1(int a, String b) {

	}

	void m1(int a, String b, int c) {

	}

	void m1(int a, int c, String b) {

	}
}
