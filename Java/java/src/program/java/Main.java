package program.java;

public class Main {
	public String brand;
	public int year;

	public void display() {
		System.out.println("This is a display method");
	}

	public static void main(String[] args) {
		// Object creation
		Main car1 = new Main();
		car1.brand = "Toyota"; // setting state
		car1.year = 2022;
		car1.display(); // calling behavior
	}

}
