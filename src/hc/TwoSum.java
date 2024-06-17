package hc;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 7, 11, 5 };
		int target = 9;

		int[] res = twoSumProb(arr, target);
		for (int val : res) {
			System.out.print(val + " ");
		}
	}

	public static int[] twoSumProb(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<>();
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			int diff = target - nums[i];
			if (map.containsKey(diff)) {
				return new int[] { map.get(diff), i };
			}
			map.put(nums[i], i);
		}
		return new int[] {};

	}

}
