package ex3;

public class Programmer extends Person {
	
	boolean notebook;
	
	public Programmer() {;}

	public Programmer(boolean notebook) {
		super();
		this.notebook = notebook;
	}
	
	@Override
	public void work() {
		System.out.println(this.name + "은(는) 코딩을 합니다.");
	}
	
	@Override
	public void hobby() {
		String[] strArr = {"A", "B", "C", "D"};
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
	}
	
	public void isNotebook() {
		if (this.notebook == true) {
			System.out.println("노트북이 있습니다.");
		}else {
			System.out.println("노트북이 없습니다.");
		}
	}
}
