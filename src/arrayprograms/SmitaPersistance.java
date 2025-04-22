package arrayprograms;

import java.util.Arrays;
import java.util.HashMap;

public class SmitaPersistance {

	public static void main(String[] args) {
		String str [] = {"java", "ajav", "aajv", "abcd", "bcda", "xyza"};
		for(int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;j++) {
				char[]ch=str[i].toCharArray();
				char[]ch1=str[j].toCharArray();
				
				Arrays.sort(ch);
				Arrays.sort(ch1);
				
				if(Arrays.equals(ch, ch1)) {
					System.out.println(str[i]+" and "+str[j]+" have same character");
				}
			}
			
		}
		

	}

}
