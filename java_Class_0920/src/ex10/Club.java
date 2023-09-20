package ex10;

public class Club extends Person{
	String event;
	
	public Club(String name, int age,String event) {
		super(name, age);
		this.event = event;
	}
	public void personInfo() {
		super.personInfo();
		System.out.println(event);
	}

}
