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
		
		CastingTask1 ct = new CastingTask1();
		Drama dr = new Drama();
		ct.checkVideo(dr);
		ct.checkVideo(new Animaition());
		ct.checkVideo(new Movie());
		
	}
}
