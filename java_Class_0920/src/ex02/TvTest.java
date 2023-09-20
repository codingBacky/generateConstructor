package ex02;

public class TvTest {

	public static void main(String[] args) {
		Tv tv = new Tv();//객체생성, 생성자호출
	//객체 생성의 전제조건 : 반드시 생성자를 통해서 생성된다. 컴파일시 기본 생성자가 만들어짐.
	//생성자는 오버로딩이 가능
	//생성자를 수동으로 작성할경우 자동으로 기본생성자가 생성되지 않는다.
		Tv tv2 = new Tv(10);
		Tv tv3 = new Tv("kor",10);
		
	}
}
