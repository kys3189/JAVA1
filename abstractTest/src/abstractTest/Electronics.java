package abstractTest;

//	반드시 필요하지만 어떤 값이 들어갈 지 모르는것 추상 클래스
public abstract class Electronics {
//	추상 메서드
	public abstract void on();
	public abstract void off();
	
	
//	상수 : final
	public final void safe() {
		System.out.println("안전장치 가동");
	}
}
