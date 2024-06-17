package hc;

import java.util.HashMap;
import java.util.Map;

public class FindHeavyBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 1, 1, 2, 1, 1, 1, 1 };
		Map<Integer, Integer> map = new HashMap<>();
		int heavyBall = 0;

		for (int val : arr) {
			map.put(val, map.getOrDefault(val, 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				heavyBall = entry.getKey();
			}
		}
		System.out.println(heavyBall);

	}

}
