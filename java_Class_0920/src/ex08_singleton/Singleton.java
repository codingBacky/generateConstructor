package ex08_singleton;

public class Singleton {
	
	static Singleton singleton = new Singleton();
	
	int apple = 100;
	
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		return singleton;
	}

}
