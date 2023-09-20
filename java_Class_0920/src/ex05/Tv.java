package ex05;

public class Tv {

	//멤버변수
	String color;//null
	boolean power;//false
	int channel;//10
	
	
	//생성자의 역할 : 멤버변수 초기화에 이용될 수 있다.
	Tv(){
		this("white", 11, false);		
		System.out.println("기본생성자");
	}
	
	public Tv(int channel) {//지역변수
		this("white", channel, false);//this 용도 2) 같은 class 내에 다른생성자 호출 기능
	}
	public Tv(String color) {//지역변수
		this(color, 11, false);		
	}

	public Tv(String color,int channel, boolean power) {
		this.color = color;//this 용도 1) 멤버변수 호출 기능
		this.power= power;
		
		this.channel = channel>100? 100:channel;
		
		this.channel = channel;
		System.out.println("다녀왔습니다.");
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
