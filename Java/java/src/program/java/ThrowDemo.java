package program.java;

public class ThrowDemo {
	static void validateAge(int age) {
		if (age < 18) {
			//Manually throwing exception
			throw new ArithmeticException("Not eligible to vote");
		}else {
			System.out.println("Eligible to vote");
		}
	}
	
	public static void main(String[]args) {
		// validateAge(15); // Will throw exception
		try {
			validateAge(15);
		}catch(ArithmeticException e) {
			System.out.println(e); 
		}
	}

}
