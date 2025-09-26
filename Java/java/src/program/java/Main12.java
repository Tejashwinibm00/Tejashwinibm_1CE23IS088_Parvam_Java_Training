package program.java;
class Animal {
	void eat() {
		System.out.println("This animal eats food.");
	}
}

//Dog inherits Animal
class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks.");
	}
}
public class Main12 {
	public static void main(String[]args) {
		Dog d = new Dog();
		d.eat();   // Inherited method
		d.bark();  // Dog's own method
	}
}
