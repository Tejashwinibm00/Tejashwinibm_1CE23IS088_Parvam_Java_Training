package program.java;

public class ExceptionExample {
	public static void main(String[]args) {
		try {
			int a = 10 , b = 0;
			int result = a / b; // Divison by zero -> ArithmeticException
			System.out.println(result);
		} catch(ArithmeticException e) {
			// this block handles the error instead of crashing the program
			System.out.println("Error: Division by zero is not allowed.");
		} finally {
			//Always executes (useful for cleanup)
			System.out.println("This block always executes.");
		}
	}
}
