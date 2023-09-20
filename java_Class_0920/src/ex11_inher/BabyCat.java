package ex11_inher;

public class BabyCat extends ParentCat{
	public String color;
	
	public BabyCat(String breed, String color) {
		super(breed);
		this.color = color;
	}
	
	void meow() {
		System.out.println("야옹");
	}
}
