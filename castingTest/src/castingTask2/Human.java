package castingTask2;

public class Human extends Monster{

	public Human() {;}
	
	@Override
	public void drop() {
		System.out.println("갑옷을 얻었다.");
	}
}
