package ex09_inher;

public class PhoneExam01 {

	public static void main(String[] args) {
		
		Phone p = new Phone("iphone","red");
		
		SmartPhone s = new SmartPhone("iphone","red",true);
		s.bell();
		s.sendVoice("안녕하세요");
		s.hangUp();
		
		SmartPhone s2 = new SmartPhone();
	}

}
