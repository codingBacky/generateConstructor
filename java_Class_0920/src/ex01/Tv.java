package ex01;

public class Tv {

	String color;//null
	boolean power;//false
	int channel;//0
	
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
