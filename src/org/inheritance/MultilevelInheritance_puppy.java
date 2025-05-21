package org.inheritance;
//More than one parent class suppoting into one child class in a tree level structure
// Base class Animal
class Animal {
    void eat() {
        System.out.println("This Animal can eat food");
    }
}

// Derived class Dog from Animal
class Dog1 extends Animal {
    void bark() {
        System.out.println("Dog can bark");
    }
}

// Derived class Puppy from Dog
class MultilevelInheritance_puppy extends Dog1 {
    void weep() {
        System.out.println("Puppy weeps");
    }

    public static void main(String[] args) {
        // Creating object of Puppy class
        MultilevelInheritance_puppy puppy = new MultilevelInheritance_puppy();

        // Calling methods from the inheritance chain
        puppy.eat();  // Inherited from Animal
        puppy.bark(); // Inherited from Dog
        puppy.weep(); // Specific to Puppy
    }
}
