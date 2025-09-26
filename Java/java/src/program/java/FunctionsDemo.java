package program.java;

public class FunctionsDemo {
	//Static method
	public static int square(int x) {
		return x * x;
	}
	
	//Overloaded instance methods
	public void greet() {
		System.out.println("Hello!");
	}
	
	public void greet(String name) {
		System.out.println("Hello, " + name + "!");
	}
	
	// Varargs method
	public static int sum(int... nums) {
		int total = 0;
		for (int n : nums)total += n ;
		return total;
	}
	
	//Recursive method
	public static int factorial(int n) {
		return (n == 0) ? 1 : n * factorial(n-1);
	}
	public static void main(String[]args) {
		//Static method call
		System.out.println("Square of 5: " + square(5));
		
		//Instance method calls
		FunctionsDemo obj = new FunctionsDemo();
		obj.greet();         //no parameter
		obj.greet("Murthy"); //overloaded version
		
		// Varargs call
		System.out.println("Sum: " + sum(2,4,6));
		
		// Recursion example
		System.out.println("Factorial of 5: " + factorial(5));
	}

}
