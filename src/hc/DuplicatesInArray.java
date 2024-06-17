package hc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> res = findDuplicates(arr);

		System.out.println(res);
	}

	public static List<Integer> findDuplicates(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 2) {
				res.add(entry.getKey());
			}
		}
		return res;

	}

}
