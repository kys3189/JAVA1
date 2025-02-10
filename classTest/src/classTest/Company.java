package classTest;

public class Company {
//	회사 클래스 필드 구성하기
//	이름, 나이, 수입
//	회사의 총 수입
		
	String name;
	int age;
	static int money;
	int income;
	
	public Company() {;}
	
	public Company(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
//	회사원은 총 4명
//	1번 +10000원
//	2번 +1000원
//	3번 +2000원
//	4번 -20000원
//	각 회사의 총 수입을 출력하기
	
	public static void main(String[] args) {
		
		Company hong = new Company("홍길동", 20);
		Company zhang = new Company("장보고", 25);
		Company li = new Company("이순신", 30);
		Company kim = new Company("김유신", 35);
		
		hong.income += 10_000;
		zhang.income += 1_000;
		li.income += 2_000;
		kim.income -= 20_000;
		
		Company.money += hong.income;
		Company.money += zhang.income;
		Company.money += li.income;
		Company.money += kim.income;
		
		System.out.println(Company.money);
		
	}
}
