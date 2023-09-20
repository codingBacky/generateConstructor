package ex10;

public class Person {
	
	private String name;
	int age;
	
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void personInfo() {
		System.out.println(name);
		System.out.println(age);
	}
}
