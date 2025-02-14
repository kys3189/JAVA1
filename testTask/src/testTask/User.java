package testTask;

//

public class User {
	
	String name;
	String job;
	int[] lottoNum;
	int[] yourLottoNum;
	
	public User(){;}

	public User(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public void yourLotto() {
		Lotto lotto = new Lotto();
		this.yourLottoNum = lotto.drawNumber();		
	}
	
	public void checkLotto() {
	}

}
