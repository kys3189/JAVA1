package testTask;

public class Employee extends User{
	
	
	public Employee() {;}
	
	@Override
	public int[] yourLotto() {
		Lotto lotto = new Lotto();
		this.yourLottoNum = lotto.drawNumber();	
		return this.yourLottoNum;
	}
	
	@Override
	public void checkLotto() {
		super.checkLotto();
		
		
	}
}
