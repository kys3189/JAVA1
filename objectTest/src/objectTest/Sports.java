package objectTest;

public class Sports extends Object {
//	1. 기본 생성자
//	2. 초기화 생성자
//	3. private 붙이기
//	4. 게터, 세터
//	5. toString 재정의
	
//	alt + shift + a 수정영역 잡기
	private String type;
	private int total;
	
	public Sports() {;}
	
	public Sports(String type, int total) {
		super();
		this.type = type;
		this.total = total;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	

	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + "]";
	}

	public static void main(String[] args) {
		Sports sports = new Sports();
		System.out.println(sports.hashCode());
		System.out.println(sports.toString());
		System.out.println(sports.equals(sports));
		
		
		
	}//메인
	
}//클래스
