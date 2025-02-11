package classTest;

class Market {
//	상품, 가격, 재고
//	sell 메서드
	
	String goods;
	int price;
	int inventory;
	
//	기본 생성자
	public Market() {;}
//	초기화 생성자 단축키 Alt + Shift + s -> o -> enter
//	public Market(String goods, int price, int inventory) {
//		this.goods = goods;
//		this.price = price;
//		this.inventory = inventory;
//	}
	public Market(String goods, int price, int inventory) {
		this.goods = goods;
		this.price = price;
		this.inventory = inventory;
	}
	
	void sell(Customer customer) {
		this.inventory = this.inventory - 1;
		customer.money -= price - price *(customer.discount / 100.0);
	}
	
}

class Customer {
//	이름, 전화번호, 돈, 할인율
	
	String name;
	String phoneNum;
	int money;
	int discount;
	
	public Customer() {;}
	public Customer( String name, String phoneNum, int money, int discount ) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.money = money;
		this.discount = discount;
	}
}

public class ClassTask1 {
	
	public static void main(String[] args) {
//		sell() 사용
//		사람의 돈을 출력
//		마켓 상품의 재고를 출력
		Market 전자상가 = new Market("컴퓨터", 100_000, 10); 
		Market 이마트 = new Market("감자", 1_000, 100); 
		Customer 김영수 = new Customer("김영수", "010-2330-3189", 150_000, 30);
		
		전자상가.sell(김영수);
		이마트.sell(김영수);
		
		System.out.println("소비자의 남은 돈 : " + 김영수.money);
		System.out.println("남은 재고 : " + 전자상가.inventory);
		System.out.println("남은 재고 : " + 이마트.inventory);
		
	}
	
}


