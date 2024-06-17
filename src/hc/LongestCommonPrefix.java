package hc;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = { "flower", "flow", "flight" };
		String s1 = arr[0];
		String s2 = arr[arr.length - 1];
		String longestCommonPrefix = "";

		Arrays.sort(arr);
		int i = 0;
		while (i < s1.length() && i < s2.length()) {
			if (s1.charAt(i) == s2.charAt(i)) {
				i++;
			} else {
				break;
			}
		}
		longestCommonPrefix = s1.substring(0, i);
		System.out.println(longestCommonPrefix);
	}

}
