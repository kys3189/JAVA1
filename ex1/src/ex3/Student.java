package ex3;

public class Student extends Person{
	
	long studentNum;
	
	public Student() {;}

	public Student(long studentNum) {
		super();
		this.studentNum = studentNum;
	}
	
	@Override
	public void hobby() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
	@Override
	public void work() {
		System.out.println(this.name + "은 공부를 합니다.");
	}
	
	public void printNumber() {
		System.out.println("학생의 이름은 " + this.name + "이며 학번은 " + this.studentNum + "입니다.");
	}
	
}
