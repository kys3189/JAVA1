package stream;

import java.util.Objects;

public class Member {

	private String name;
	private String hobby;
	private String intro;

	public Member() {;}

	public Member(String name, String hobby, String intro) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.intro = intro;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", hobby=" + hobby + ", intro=" + intro + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hobby, intro, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(hobby, other.hobby) && Objects.equals(intro, other.intro)
				&& Objects.equals(name, other.name);
	}
	
	
}
