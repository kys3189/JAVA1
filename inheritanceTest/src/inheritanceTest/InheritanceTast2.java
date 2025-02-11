package inheritanceTest;
//상속 및 분리 실습
//Person 클래스
//이름, 나이, 주소, 핸드폰 번호
//work 일을 한다.
//sleep 잠을 잔다.
//eat 세 끼를 먹는다

//Student 클래스
//인스타아이디
//work 아르바이트를 한다
//sleep 수업 시간에 잠을 잔다
//eat 아침을 거른다


//Employee 클래스
//비상금
//work 하루 종일 일을 한다
//sleep 잠을 설친다
//eat 야식을 먹는다

public class InheritanceTast2 {
//	메인 메서드 생성 후 객체화
//	각 메서드 출력하기
	public static void main(String[] args) {
		
		Person 이순신 = new Person("이순신", 25, "서울", 010_1111_1111);
		Student 홍길동 = new Student("홍길동", 19, "부산", 010_2222_2222, "hong_instar");
		Employee 장보고 = new Employee("장보고", 33, "대구", 010_3333_3333, 33_333);
		
		이순신.work();
		이순신.eat();
		이순신.sleep();
		
		홍길동.work();
		홍길동.eat();
		홍길동.sleep();
		홍길동.instarId();
		
		장보고.work();
		장보고.eat();
		장보고.sleep();
		장보고.fund();
		
	}
	
}
