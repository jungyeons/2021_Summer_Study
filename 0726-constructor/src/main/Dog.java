package main;

public class Dog {
	private int age;
	private String name;
	
	//private을 외부에서 접근하는 방법
	
	public Dog(int age,String name) {
		this.age = age;
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
