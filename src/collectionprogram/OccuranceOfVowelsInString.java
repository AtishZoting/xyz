package collectionprogram;

import java.util.LinkedHashMap;

public class OccuranceOfVowelsInString {

	public static void main(String[] args) {
		String s = "hellotestingshastra";
		char[] ch = s.toCharArray();

		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		map.put('a', 0);
		map.put('a', 0);
		map.put('e', 0);
		map.put('i', 0);
		map.put('o', 0);
		map.put('u', 0);

		System.out.println(map);
		for (Character c : ch) {
			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);
			}
		}

		map.forEach((k, v) -> System.out.println(k + " " + v));
	}

}
