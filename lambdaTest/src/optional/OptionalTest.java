package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalTest {

	ArrayList<User2> users = new ArrayList<User2>(Arrays.asList(
			new User2("김영수", "kys", "1234"),
			new User2("홍길동", "hgd", "2345"),
			new User2("장보고", "jbg", "7890"),
			new User2("이순신", "lss", "4567")
			));
	
	public Optional<User2> findById(Long id) {
		User2 user = null;
		for (User2 userInDB : users) {
			if (userInDB.getId() == id) {
				user = userInDB;
			}
		}
		return Optional.ofNullable(user);
	}
	
	public static void main(String[] args) {
	
		OptionalTest ot = new OptionalTest();
		Optional<User2> user = ot.findById(2L);
		
//		orElse : null이 아니라면 user, null이라면 () -> {예외발생}
//		user.orElse(new User2());
		
//		orElseThrow : null 아니라면 user, null이라면 대체 user
//		user.orElseGet(() -> {
//			throw new RuntimeException("그런 회원 없습니다.");
//		});
		
//		ifPresent : 없으면 버려!
		user.ifPresent((findUser) -> {
//			null이 아닐 때만 아래 로직을 실행해!
			System.out.println("ifPresent");
			System.out.println(findUser.toString());
		});
		
		System.out.println(user.isPresent());
//		null일때 하고 아닐때 이거해
		user.ifPresentOrElse((findUser) -> {
//			null이 아닐 때
			System.out.println("존재 하는 회원");
		}, () -> {
			System.out.println("존재하지 않는 회원");
		});
		
	}
	
}
