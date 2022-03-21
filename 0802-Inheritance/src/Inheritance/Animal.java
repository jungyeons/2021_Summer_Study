package Inheritance;

public class Animal {
	int weight;
	String earshape;
	int age;
    
	void eat(String food) {
		weight += food;
	}
	void getOld(int age) {
		if(age>10) {
			System.out.println("마음의 준비를 하십시오.");
		}else {
			System.out.println("아직은 괜찮습니다.");
		}
	}
}
