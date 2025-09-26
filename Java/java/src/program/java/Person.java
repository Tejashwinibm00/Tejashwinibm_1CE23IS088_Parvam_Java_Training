package program.java;

public class Person {
	//Private field (cannot be accessed directly outside the class)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[]args) {
		Person p = new Person();
		p.setName("John");                 //setting value
		System.out.println(p.getName());  //getting value
	}	
}