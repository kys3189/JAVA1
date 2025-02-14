package testTask;

//자바 문제
//클래스 Lotto
//메서드 drawNumber로 추첨한다. 추첨은 아래와 같다.
//1 ~ 45까지의 랜덤한 숫자를 6개 추출한다.
//
//메서드 checkLotto
//로또의 구매는 회사원과 연구원만 구매할 수 있으며 checkLotto 메서드로 당첨자를 확인한다.
//로또를 구매하는 회사원과 연구원이 아닌 경우 "로또를 구매할 수 없습니다"를 출력한다.
//
//회사원과 연구원이 가진 로또 번호가 
//1등 또는 2등이라면 각각의 메서드를 실행한다.
//
//회사원 1등 시 콘솔에 "직장을 그만둔다"를 출력한다.
//회사원 2등 시 콘솔에 "전액을 저축한다"를 출력한다.
//
//연구원 1등 시 콘솔에 "연구에 투자한다"를 출력한다.
//연구원 2등 시 콘솔에 "지인에게 밥을 산다"를 출력한다.

public class Result {

	public static void main(String[] args) {
		
		Lotto lotto = new Lotto();
		Employee employee = new Employee();
		
		System.out.println(employee.name);
		
		int[] lottoNum = new int[6];
		int[] yourLottoNum = new int[6];
		
		lottoNum = employee.yourLotto();
		yourLottoNum = lotto.drawNumber();
		
		for (int i = 0; i < 6; i++) {
			System.out.print(lottoNum[i] + " ");			
		}
		
		System.out.println();
		
		for (int i = 0; i < 6; i++) {
			System.out.print(yourLottoNum[i] + " ");			
		}
		
	}//메인
	
}//클래스
