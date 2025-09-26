package program.java;

public class MutipleException {
	public static void main(String[]args) {
		try {
			int[] arr = {1,2,3};
			System.out.println(arr[5]); // Invalid index -> ArrayIndexOutOfBoundsException
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic error occured.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index is invalid.");
		} catch (Exception e) {
			// Generate handler for any other exception
			System.out.println("Some other exception occured: " + e);
		}
	}
}

