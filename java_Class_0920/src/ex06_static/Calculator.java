package ex06_static;

public class Calculator {

	int result;//인스턴스 변수
	static int minus;//정적변수, 클래스 변수
	
	//인스턴스 메서드
	void add(int num1, int num2) {
		result =  num1 + num2;
	}
	
	//정적 메서드, 클래스 메서드
	static void sub(int num1, int num2) {
		minus = num1 - num2;
		
	}
}
