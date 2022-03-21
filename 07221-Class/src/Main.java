
public class Main {

	public static void main(String[] args) {
		Puppy p1 = new Puppy();
		p1.name = "동그리";
		p1.age = 5;
		p1.color = "brown";
		
		Puppy p2 = new Puppy();
		p2.name = "하양";
		p2.age = 3;
		p2.color = "white";
		
		p2.run();
		p1.bark();
		

	}

}
