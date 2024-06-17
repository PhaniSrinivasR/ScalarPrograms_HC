package hc;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paragraph = "the quick brown fox jumps over the lazy dog the quick";
		String res = mostCommonWord(paragraph);
		System.out.println("The most frequent word in paragraph is: " + res);
	}

	public static String mostCommonWord(String str) {
		Map<String, Integer> map = new HashMap<>();
		str = str.toLowerCase().replaceAll("[^a-zA-Z ]", " ");
		String[] words = str.split(" ");
		int maxNum = 0;
		String maxString = "";

		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxNum && entry.getKey() != "") {
				maxNum = entry.getValue();
				maxString = entry.getKey();
			}
		}
		return maxString;
	}

}
