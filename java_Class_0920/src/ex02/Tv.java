package ex02;

public class Tv {

	String color;//null
	boolean power;//false
	int channel;//0
	
	Tv(){
		System.out.println("기본생성자");
	}
	
	public Tv(int i) {
		channel = i;
		System.out.println("1개 변수");
	}

	public Tv(String sub, int i) {
		channel = i; color = sub;
		System.out.println("2개 변수");
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
