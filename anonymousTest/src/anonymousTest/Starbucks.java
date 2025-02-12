package anonymousTest;

public class Starbucks {
//	Form타입에 FormAdapter가 들어왔으니 뭐다? 업캐스팅이다.
	public void register(Form form) {
		String[] menu = form.getMemus();
		for (int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + "." + menu[i]);
		}
		
//		판매 중인 곳인지, 무료나눔을 하고 있는 곳인지 판별
		if (form instanceof FormAdapter) {
			System.out.println("무료 나눔 행사중");
		}
		form.sell("카페라떼");			
		
		
	}
}
