package stringprograms;

public class FrequencyOfword {

	public static void main(String[] args) {
		String s="i am atish i am from pune";
		String[]words=s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			int count=0;
			String res="";
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equals(words[j])) {
					res=words[i]+res;
					count++;
				}
			}
			//if(count>1) {
				System.out.println(res+count);
		//}
		}
	}

}
