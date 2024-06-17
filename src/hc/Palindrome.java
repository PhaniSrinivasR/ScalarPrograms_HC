package hc;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val = 121232121;
		int temp = val;
		int reverse = 0;

		while (temp > 0) {
			reverse = (reverse * 10) + (temp % 10);
			temp /= 10;
		}
		if (reverse == val) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
