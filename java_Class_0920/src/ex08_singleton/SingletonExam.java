package ex08_singleton;

public class SingletonExam {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s.apple);
	}
}
