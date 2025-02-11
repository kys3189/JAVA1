package inheritanceTest;

class A {
	String name;
	int data;
	public A() {
		System.out.println(this);
		System.out.println("부모 생성자 호출");
		this.name = "A";
		this.data = 10;
	}
	void printName() {
		System.out.println(name);
	}
}
class B extends A {
//	String name;
//	int data;
	
	public B() {
		super();//상속을 물려줄 부모의 클래스를 먼저 호출해줌
		System.out.println(this);
		System.out.println("자식생성자 호출");
	}
	void printData() {
		System.out.println(data);
	}
}

public class InheritanceTest1 {
	public static void main(String[] args) {
//		B만 메모리에 할당했지만, 익스텐드된 A를 먼저 올리고 B가 할당된
		B b = new B();
		b.printName();
		b.printData();
		System.out.println(b);
	}
}
