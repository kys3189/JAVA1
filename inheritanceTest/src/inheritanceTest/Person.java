package inheritanceTest;

public class Person {

	String name;
	int age;
	String address;
	int phoneNum;
	
	public Person() {;}

	public Person(String name, int age, String address, int phoneNum) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	
	void work() {
		System.out.println(name + "은(는) 일을 한다.");
	}
	void sleep() {
		System.out.println(name + "은(는) 잠을 잔다.");
	}
	void eat() {
		System.out.println(name + "은(는) 세 끼를 먹는다.");
	}
	
}
