package anonymousTest;

public class AnonymousTest {
	public static void main(String[] args) {
//		메서드를 감싸고 있으니 클래스네? 근데 이름이 없으니 익명 클래스?? 인데 클래스 안에 있으니 내부 익명 클래스??
//		implement 한 것과 동일하지만, 한 번만 사용하기 위해 작성된다.
//		업캐스팅 자식요소 익명 클래스가 부모요소 스터디에 들어가서??
		Study study = new Study() {
			@Override
			public void setTopic(String topic) {
				System.out.println("주제 : " + topic);
			}
		};
		
		study.setTopic("화학");
	}
}
