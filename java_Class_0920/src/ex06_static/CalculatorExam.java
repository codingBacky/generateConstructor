package ex06_static;

public class CalculatorExam {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(10, 20);
		System.out.println(cal.result);
		
		//static 변수인지 인스턴스 변수인지 파악할 수 없다.
		//static 변수는 객체를 생성하지 않고 사용하는 것을 권장한다.
		System.out.println(cal.minus);
		
		
		
		Calculator cal2 = new Calculator();
		cal2.add(100, 200);
		System.out.println(cal2.result);
		System.out.println(cal2.minus);
		
		cal.sub(10, 5);
		System.out.println(cal.minus);
		
		//객체 생성없이도 사용할수 있음 클래스명.메서드
		Calculator.sub(50, 10);
		System.out.println(Calculator.minus);
		
		cal.minus=123;
		
		Calculator cal3 = new Calculator();
		System.out.println(cal3.minus);
	}

}
