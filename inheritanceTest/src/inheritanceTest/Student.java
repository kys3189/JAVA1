package inheritanceTest;

public class Student extends Person {

String instarId;
	
	public Student() {;}

	public Student(String name, int age, String address, int phoneNum, String instarId) {
		super(name, age, address, phoneNum);
		this.instarId = instarId;
	}
	
	@Override
	void work() {
		System.out.println(name + "은(는) 아르바이트를 한다.");
	}
	@Override
	void sleep() {
		System.out.println(name + "은(는) 수업시간에 잠을 잔다.");
	}
	@Override
	void eat() {
		System.out.println(name + "은(는) 아침을 거른다.");
	}
	void instarId() {
		System.out.println(name + ", 그의 인스타 아이디는 " + instarId + "이다");
	}
	
}
