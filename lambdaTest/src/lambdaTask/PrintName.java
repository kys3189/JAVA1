package lambdaTask;

//성과 이름을 전달하면 전체이름을 만들어주는 메서드 구현하기
@FunctionalInterface
public interface PrintName {
	
	public String name(String name1, String name2);
	
}
