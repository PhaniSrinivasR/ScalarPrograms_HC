package hc;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abracadabra";
		HashMap<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		int maxFreq = 0;
		char mostFreqChar = ' ';
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxFreq) {
				maxFreq = entry.getValue();
				mostFreqChar = entry.getKey();
			}
		}

		System.out.println(mostFreqChar);

	}

}
