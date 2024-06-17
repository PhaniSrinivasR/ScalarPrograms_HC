package hc;

public class AddTwoLargeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "123456789123456789";
		String str2 = "987654321987654321";

		String str = "";

		int n1 = str1.length(), n2 = str2.length();

		str1 = new StringBuilder(str1).reverse().toString();
		str2 = new StringBuilder(str2).reverse().toString();

		int carry = 0;
		for (int i = 0; i < n1; i++) {
			int sum = ((int) (str1.charAt(i) - '0') + (int) (str2.charAt(i) - '0') + carry);
			str += (char) (sum % 10 + '0');
			carry = sum / 10;
		}

		for (int i = n1; i < n2; i++) {
			int sum = ((int) (str2.charAt(i) - '0') + carry);
			str += (char) (sum % 10 + '0');
			carry = sum / 10;
		}
		if (carry > 0) {
			str += (char) (carry + '0');
		}
		str = new StringBuilder(str).reverse().toString();
		System.out.println(str);

	}

}
