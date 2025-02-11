package access1;

public class Access1 {
	int data1;
	public int data2;
	protected int data3;
	private int data4;//다른곳에서 값에 접근하지 못하게하고 게터세터를 만들어서 그렇게만 접근할 수 있게함
	
	public Access1() {;}
	
	public int getData4() {
		return data4;
	}
	
	public void setData4(int data4) {
		this.data4 = data4;
	}
}
