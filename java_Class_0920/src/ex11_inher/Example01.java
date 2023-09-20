package ex11_inher;

public class Example01 {

	public static void main(String[] args) {
		BabyCat cat = new BabyCat("샴고양이", "초콜릿색");
		
		cat.eat();
		cat.meow();
		System.out.println(cat.breed + cat.color);
	}

}
