package castingTest;

public class CastingTask2 {

	public static void main(String[] args) {

		int num1 = 1;
		String str1 = "8.24", str2 = "7.8";
		double d1 = Double.parseDouble(str1);
		int i1 = (int)d1;
		double d2 = Double.parseDouble(str2);
     	int i2 = (int)d2;
     	System.out.printf("%s" + (i1 + i2), num1);
		
		
		char c1 = 'a' - 32;
		char c2 = 'j' - 32;
		char c3 = 'k' - 32;
		
		String resultA = "" + c1 + "," + c2 + "," + c3;
		
		System.out.println("\n" + resultA);
		
		
      

		String strA = "12.123";
		String strB = "345.789";
		String strC = "6789.456";
		
		double dA = Double.parseDouble(strA);
		double dB = Double.parseDouble(strB);
		double dC = Double.parseDouble(
				strC);
		
		int iA = (int)dA;
		int iB = (int)dB;
		int iC = (int)dC;
		
		String result = "" + iA + iB + iC;
		
		System.out.println(result);
		
	}
}
