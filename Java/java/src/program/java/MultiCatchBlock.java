package program.java;

public class MultiCatchBlock {
	public static void main(String[]args) {
		try {
			String str = null ;
			System.out.println(str.length()); // NullPointerException
		} catch(ArithmeticException | NullPointerException e) {
			//Handles both Arithmetic & NullPointer in same block
			System.out.println("Caught: " + e);
	}
}
}

