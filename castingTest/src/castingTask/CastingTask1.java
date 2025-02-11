package castingTask;

public class CastingTask1 {
	
//	넷플릭스
//	애니메이션, 영화, 드라마
//	사용자가 선택한 영상이 애니메이션이라면 "자막 지원" 기능 사용
//	영화라면 "4D" 기능 사용
//	드라마라면 "굿즈" 기능 사용

	public void checkVideo(Video video) {
		if (video instanceof Drama) {
			Drama drama = (Drama)video;
			drama.outGoods();
		} else if (video instanceof Animaition) {
			Animaition ani = (Animaition)video;
			ani.outTitle();
		} else if (video instanceof Movie) {
			Movie movie = (Movie)video;
			((Movie) video).out4D();
		}
	}
	
	public static void main(String[] args) {
		
		//클래스명 ct = Heap 영역에 메모리를 할당하고 초기값을 초기화, 해당클래스의 필드를 메모리에 생성하고 부여된 주소값을 호출
		//이걸 뭐라한다? 객체화
		CastingTask1 ct = new CastingTask1();
		//클래스명 dr = Heap 영역에 메모리를 할당하고 값을 초기화, 해당클래스의 영역을 메모리에 부여하고 주소값을 호출
		Drama dr = new Drama();
		//클래스명 ct의 멤버에 접근할 수 있게 해주는 연산자, 멤버메서드 체크비디오(값)
		ct.checkVideo(dr);
		//클래스명 ct의 멤버에 접근할 수 있게 해주는 연산자,값은?
		//힙영역에 메모리를 할당하고 값을 초기화, 그리고 클래스영역을 메모리에 부여하고 주소값을 호출;
		ct.checkVideo(new Animaition());
		ct.checkVideo(new Movie());
		
	}
}
