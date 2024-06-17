package hc;

public class StringToInt {
	public static void main(String[] args) {
		String str = "123456";
		int integerVal = strToInt(str);
		System.out.println(integerVal);
	}

	public static int strToInt(String s) {
		int res = 0;
		int n = s.length();

		for (int i = 0; i < n; i++) {
			res = res * 10 + (s.charAt(i) - '0');
		}
		return res;
	}

}
