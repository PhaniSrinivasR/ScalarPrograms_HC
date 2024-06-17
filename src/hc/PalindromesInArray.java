package hc;

import java.util.ArrayList;
import java.util.List;

public class PalindromesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 123, 121, 454, 567 };
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (isPalindrome(arr[i])) {
				list.add(arr[i]);
			}
		}
		System.out.println(list);
	}

	public static boolean isPalindrome(int val) {
		int temp = val;
		int reverse = 0;

		while (temp > 0) {
			reverse = (reverse * 10) + (temp % 10);
			temp /= 10;
		}
		if (reverse == val) {
			return true;
		}
		return false;
	}

}
