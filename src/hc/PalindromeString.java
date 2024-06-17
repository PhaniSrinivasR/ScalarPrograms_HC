package hc;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abbabba";
		boolean res = isPalindrome(str);
		if (res) {
			System.out.println("The given string " + str + " is a Palindrome");
		} else {
			System.out.println("The given string " + str + " is not a Palidrome");
		}
	}

	public static boolean isPalindrome(String s) {
		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
