package ex09_inher;

public class Phone {
	
	String model;
	String color;
	
	/*
	 * public Phone() {
	 * 
	 * }
	 */	
	public Phone() {
		super();
	}
	
	public Phone(String model) {
		this.model = model;
		
	}
	public Phone(String model, String color) {
		this(model);
		this.color = color;
	}




	public void bell() {
		System.out.println("전화벨이 울립니다.");
	}
	
	public void sendVoice(String message) {
		System.out.println("음성 메시지를 보냅니다: " + message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
