package org.Encapsulation;
/*
 * Encapsulation in Java is one of the core concepts of object-oriented programming (OOP).
 *  It refers to wrapping data (variables) and code (methods) together into a single unit, 
 *  typically a class, and restricting direct access to some of the object's components. 
 *  This is done to protect the internal state of an object and promote modularity and maintainability.
 *  Key Points of Encapsulation:
Data Hiding: The fields (variables) of a class are kept private, meaning they cannot be accessed directly from outside the class.
Public Methods (Getters/Setters): Access to the private fields is provided through public methods — commonly called getters and setters.
Security & Control: It allows the class to control how important data is accessed or modified. For example, you can add logic to validate input before changing a field.
 *  Benefits of Encapsulation:
Improved security of data.
Better control over class attributes.
Easy maintenance and flexibility in code.
Hiding implementation details and exposing only what is necessary (abstraction).
 */

public class Example {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Age must be non-negative");
		}

	}

	public static void main(String[] args) {
		Example example = new Example();
		example.setAge(13);
		example.setName("Ram");
		System.out.println(example.getName());
		System.out.println(example.getAge());

	}
}
