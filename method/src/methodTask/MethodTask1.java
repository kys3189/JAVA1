package methodTask;

public class MethodTask1 {
	
	void numPrint() {
		for (int i = 0; i < 10; i++) {			
			 System.out.println(i+1);
		}
	}
	
	void namePrint(String name, int num1) {
		for (int i = 0; i < num1; i++) {
			System.out.println(name);
		}
	}
	
	public static void main(String[] args) {
		
		MethodTask1 mt = new MethodTask1();
		
		mt.numPrint();
		mt.namePrint("김영수", 10);
		
	}
}
