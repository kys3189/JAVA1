package inheritanceTest;

public class Employee extends Person {

	int emergencyFund;
	
	public Employee() {;}

	public Employee(String name, int age, String address, int phoneNum, int emergencyFund) {
		super(name, age, address, phoneNum);
		this.emergencyFund = emergencyFund;
	}
	
	@Override
	void work() {
		System.out.println(name + "은(는) 하루 종일 일을 한다.");
	}
	@Override
	void sleep() {
		System.out.println(name + "은(는) 잠을 설친다.");
	}
	@Override
	void eat() {
		System.out.println(name + "은(는) 야식을 먹는다.");
	}
	
	void fund() {
		System.out.println(name + ", 그의 비상금은 " + emergencyFund + "원 정도 있다.");
	}
	
}
