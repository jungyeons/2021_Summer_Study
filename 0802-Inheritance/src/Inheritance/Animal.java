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
			System.out.println("������ �غ� �Ͻʽÿ�.");
		}else {
			System.out.println("������ �������ϴ�.");
		}
	}
}
