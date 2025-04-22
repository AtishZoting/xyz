package stringprograms;

import java.util.HashMap;

public class StringOccurance {

	public static void main(String[] args) {
		String s = "hi i am atish i am from pune";
		String[] sp = s.split(" ");
/*
		for (int i = 0; i < sp.length; i++) {
			if (sp[i].equals("")) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < sp.length; j++) {
				if (sp[i].equals(sp[j])) {
					count++;
					sp[j] = "";
				}
			}
			System.out.println(sp[i] + "=" + count);
		}
		*/
		//2nd approach
		
		HashMap<String, Integer>map= new HashMap<>();
		for(String addsp:sp) {
			if(map.containsKey(addsp)) {
				map.put(addsp,map.get(addsp)+1);
			}else {
				map.put(addsp, 1);
			}
		}
		map.forEach((k,v)->System.out.println(k+"="+v));
		

	}

}
