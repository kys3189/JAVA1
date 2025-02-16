package ex3;

public class Person {
	
	String name;
	int age;
	String job;
	String hobby;
	
	public Person() {;}

	public Person(String name, int age, String job, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.job = job;
		this.hobby = hobby;
	}
	
	public void work() {
		System.out.println(this.name + "은(는) 하는 일이 없습니다.");
	}

	public void hobby() {
		System.out.println("취미는 " + this.hobby + "입니다.");
	}
	
	public static void main(String[] args) {
		
		Person ps = new Person();
		Person st1 = new Student();
		Student st2 = (Student)st1;
		Person pg1 = new Programmer();
		Programmer pg2 = (Programmer)pg1;
		
		ps.name = "홍길동";
		ps.hobby = "잠자기";
		st2.name = "장보고";
		st2.studentNum = 1;
		pg2.name = "이순신";
		pg2.notebook = true;
		
		ps.work();
		ps.hobby();
		st2.work();
		st2.hobby();
		st2.printNumber();
		pg2.work();
		pg2.hobby();
		pg2.isNotebook();
		
		
	}//메인
	
}//클래스
