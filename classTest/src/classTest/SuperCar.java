package classTest;

import java.util.Scanner;

//	자동차
public class SuperCar {
//	클래스 필드의 초기화는 컴파일러가 자동으로 해준다.
	String brand; // ""
	String color; // ""
	long price; // 0L
	boolean engine; // false
	String password; // ""
	int errorCount; // 0
	
//	초기화 블록 이 클래스가 생성될 때 초기값을 넣어주기 위해 사용되는 블록
	{
		this.password = "0000";
	}
	
//	static 블록 객체가 할당될 때 반드시 한번 실행되는 블록
	static {
		System.out.println("출고 축하드립니다.");
	}
	
	public SuperCar() {;}
		
	public SuperCar(String brand, String color, long price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	public SuperCar(String brand, String color, long price, String password) {
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.password = password;
	}
	
//	시동을 켜기
	void engineStart() {
		this.engine = true;
	}
	
//	시동을 끄기
	void engineStop() {
		engine = false;
	}
	
//	비밀번호 검사
	public boolean checkPassword(String password) {
//		문자열.equals() 같은지 아닌지 검사하는 메서드
		return this.password.equals(password);
	}
	
	public static void main(String[] args) {
	
		SuperCar ferrari = new SuperCar("Ferrari", "Red", 700_000_000, "7777");
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		String password = null;
		
		while(true) {
			System.out.println("1. 시동 켜기\n2. 시동 끄기");
			choice = sc.nextInt();
			
			if (choice == 1) {
				if (!ferrari.engine) {
					System.out.println("비밀번호 : ");
					password = sc.next();
					if(ferrari.checkPassword(password)) {
						ferrari.errorCount = 0;
						ferrari.engineStart();
						System.out.println(ferrari.brand + " 시동 켜짐");
					} else {
						ferrari.errorCount++;
						if (ferrari.errorCount > 2) {
							System.out.println("경찰 출동");
							break;
						}
					}
				} else {
					System.out.println("이미 시동이 켜져있습니다.");
				}
			} else if (choice == 2) {
				if (ferrari.engine) {
					ferrari.engineStop();
					System.out.println(ferrari.brand + " 시동 꺼짐");
				} else {
					System.out.println("이미 시동이 꺼져있습니다.");
				}
			} else {
				System.out.println("다시 눌러!!");
			}
		}
		
	}
	
}
