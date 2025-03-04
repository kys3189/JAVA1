package inheritanceTest;

class Car {
	String brand;
	String color;
	long price;
	
	public Car() {;}
	public Car(String brand, String color, long price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void enginStart() {
		System.out.println("열쇠 시동 켜짐");
	}
	void enginStop() {
		System.out.println("열쇠 시동 꺼짐");
	}
	
}
class SuperCar extends Car {
	String mode;
	
	public SuperCar() {;}
	public SuperCar(String brand, String color, long price, String mode) {
		super(brand, color, price);
		this.mode = mode;
	}
	
	@Override
	void enginStart() {
//		super.enginStart();
		System.out.println("음성 시동 켜짐");
	}
	
	@Override
	void enginStop() {
//		super.enginStop();
		System.out.println("음성 시동 꺼짐");
	}
	
}

public class InheritanceTask1 {
	public static void main(String[] args) {
		Car matiz = new Car("기아", "빨강", 10000000);
		SuperCar ferrari = new SuperCar("페라리", "빨강", 1000000000, "고속");
		ferrari.enginStart();
		matiz.enginStart();
	}
}
