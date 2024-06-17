package hc;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> hashmap = new HashMap<>();

		hashmap.put("a", 3);
		hashmap.put("b", 1);
		hashmap.put("c", 2);

		System.out.println("Before sorting:");
		System.out.println(hashmap);

		System.out.println("\nAfter sorting");

		Map<String, Integer> sortedMap = hashmap.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,
						Map.Entry::getValue, (key, value) -> key, LinkedHashMap::new));

		System.out.println(sortedMap);
	}

}
