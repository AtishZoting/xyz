package collectionprogram;

import java.util.*;

public class OddnumberOccurance {

	public static void main(String[] args) {
		int[] x = { 1, 2, 2, 3, 4, 5, 6, 3, 1, 5, 1, 9 };

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : x) {
			if (i % 2 != 0) {
				if (map.containsKey(i)) {
					map.put(i, map.get(i) + 1);
				} else
					map.put(i, 1);
			}
		}

		System.out.println(map);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() >= 1) {
				System.out.println(entry.getKey() + "=" + entry.getValue());
			}
		}
	}
}
