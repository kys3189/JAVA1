package castingTask2;

public class Ork extends Monster{

	public Ork() {;}
	
	@Override
	public void drop() {
		System.out.println("가죽을 얻었다.");
	}
}
