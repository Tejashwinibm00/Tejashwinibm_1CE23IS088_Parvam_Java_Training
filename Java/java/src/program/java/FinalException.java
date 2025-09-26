package program.java;

public class FinalException {
		public static void main(String[]args) {
			try {
				int num = Integer.parseInt("123") ;
				System.out.println("Number: " + num);
			} catch(NumberFormatException e) {
				System.out.println("Invalid number format.");
		    } finally {
		    	System.out.println("End of program."); //always runs
		    }
		}
}
