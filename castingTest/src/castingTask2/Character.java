package castingTask2;

import javax.crypto.CipherOutputStream;

public class Character {
//	이름, 직업, 레벨
//	사냥하는 메서드
	//지역 변수
	String name;
	String jod;
	int level;
	//기본 생성자
	public Character() {;}
	// 클래스(타입 : 저장공간) {객체}
	public Character(String name, String jod, int level) {
		//this 해당 객체를 참조하여 주소값에 접근할 수 있게해주는 키워드
		//. 해당 객체의 멤버에 접근할 수 있게 해주는 연산자
		//왼쪽은 저장공간, 오른쪽은 값
		this.name = name;
		this.jod = jod;
		this.level = level;
	}
	//몬스터타입 몬스터저장공간
	public void hunting(Monster monster) {
		//왼쪽에 타입이 없는 몬스터는 뭐다? 값이다.
		if (monster instanceof Ork) {
			Ork ork = (Ork)monster;
			ork.drop();
		} else if (monster instanceof Fairy) {
			Fairy fairy = (Fairy)monster;
			fairy.drop();
		} else if (monster instanceof Human) {
			Human human = (Human)monster;
			human.drop();
		}
	}
	
}
