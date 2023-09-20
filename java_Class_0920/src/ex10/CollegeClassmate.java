package ex10;

public class CollegeClassmate extends Person{
	String Major;

	public CollegeClassmate(String name,int age,String major) {
		super(name,age);
		this.Major = major;
	}
	public void personInfo2() {
		personInfo();
		System.out.println(Major);
	}
}
