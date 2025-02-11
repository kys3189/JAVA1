package castingTest;

class Car {
	public Car() {;}
	
	void enginStart() {
		System.out.println("열쇠로 시동 킴");
	}
}

class SuperCar extends Car {
	public SuperCar() {;}
	
	@Override
	void enginStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	void openRoof() {
		System.out.println("뚜껑 오픈");
	}
}

public class CastingTest {

	public static void main(String[] args) {
		
		Car matiz = new Car();
		SuperCar ferrari = new SuperCar();
		
//		up casting
		Car noOptionFerrari = new SuperCar();
		noOptionFerrari.enginStart();
		
//		down casting
		SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
		fullOptionFerrari.openRoof();
		
//		instanceof 타입 : 참 또는 거짓
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(ferrari instanceof Car);
		System.out.println(ferrari instanceof SuperCar);
		System.out.println(noOptionFerrari instanceof Car);
		System.out.println(noOptionFerrari instanceof SuperCar);
		System.out.println(fullOptionFerrari instanceof Car);
		System.out.println(fullOptionFerrari instanceof SuperCar);
		
//		오류
//		SuperCar ferrari2 = new Car(); // 이따구로 하면 안댄다?
		
	}
	
}
