package castingTask2;

import javax.crypto.CipherOutputStream;

public class Character {
//	이름, 직업, 레벨
//	사냥하는 메서드
	String name;
	String jod;
	int level;
	
	public Character() {;}

	public Character(String name, String jod, int level) {
		this.name = name;
		this.jod = jod;
		this.level = level;
	}
	
	public void hunting(Monster monster) {
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
