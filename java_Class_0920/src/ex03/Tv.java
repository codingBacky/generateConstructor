package ex03;

public class Tv {

	//멤버변수
	String color;//null
	boolean power;//false
	int channel;//10
	
	
	//생성자의 역할 : 멤버변수 초기화에 이용될 수 있다.
	Tv(){
		System.out.println("기본생성자");
	}
	
	public Tv(int channel) {//지역변수
		this.channel = channel;//this.멤버변수
	}

	public Tv(String color, boolean power, int channel) {
		this.color = color;
		this.power= power;
		this.channel = channel;
		
	}

	void power() {
		power = !power;
	}
	void channelUp(){
		channel++;
	}
	void channelDown(){
		channel--;
	}
}
