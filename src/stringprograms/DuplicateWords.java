package stringprograms;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWords {
	
	public void duplicateword() {

		String s= "my name is atish and atish is very cool";
		String []str=s.split(" ");
		
		Set<String> hset= new LinkedHashSet<>();
		for (String st : str) {
			if(hset.add(st)==false) {
				System.out.print(st+" ");
			}
		}
	}
	
	private void removeDuplicateWords() {
		String s= "my name is atish and atish is very cool";
		String[]str=s.split(" ");
		
		String res="";
		
		Set<String> lset= new LinkedHashSet<>();
		for (String st : str) {
			lset.add(st);
		}
		
		for (String string : lset) {
			res= res+string+" ";
		}
		System.out.println(res);
		
		
	}
	
	private void usingforLoopFindDuplicateWord() {
		String s= "my name is atish and atish is very cool";
		String[]str=s.split(" ");
		
		System.out.println(str.length);
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					System.out.print(str[i]+" ");
					//break;
				}
				
			}
		}
	}
	
	private void UsingLoopRemoveDuplicate() {
		String s= "my name is atish and atish is very cool";
		String[]str=s.split(" ");
		String res="";
		
		for (int i = 0; i < str.length; i++) {
			int count=0;
			for (int j = i+1; j < str.length; j++) {
				if(str[i].equals(str[j])) {
					count++;
					//continue;
				}
			}
			if(count==0) {
				res=res+str[i]+" ";
			}
		}
		System.out.println(res);

	}
	
	public static void main(String[] args) {
		//new DuplicateWords().duplicateword();
		//new DuplicateWords().removeDuplicateWords();
		new DuplicateWords().usingforLoopFindDuplicateWord();
		new DuplicateWords().UsingLoopRemoveDuplicate();
	}

}
