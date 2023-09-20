package ex10;

public class PhoneNumberList {
	
	public static void main(String[] args) {
		CollegeClassmate col = new CollegeClassmate("mimi",25,"computer");
//		col.Major = "computer";
//		col.age = 25;
//		col.name = "mimi";
		System.out.println();
		col.personInfo2();
		Club club = new Club("juju", 20, "painting");
		club.personInfo();
		
	}

}
