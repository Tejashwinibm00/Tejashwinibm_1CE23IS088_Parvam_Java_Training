package program.java;

public class DataTypesExample {
	static int staticVar = 100 ; //Static variable
	int instanceVar = 50;        //Instance variable
	
	public void display() {
		int localVar = 25 ;     //Local variable
		System.out.println("Static: " + staticVar);
		System.out.println("Instance: " + instanceVar);
		System.out.println("Local: " + localVar);
	}
	
	public static void main(String[]args) {
		DataTypesExample obj = new DataTypesExample();
		obj.display();
		double pi = 3.14;
		int approxPi  =  (int) pi; //Explicit casting
		System.out.println("Approximate Pi: " + approxPi);
	}

}
