package stringprograms;

public class MaxOccurance {

	public static void main(String[] args) {
		String s="aaabbbbbbbcdddddeff";
		char[]ch=s.toCharArray();
		int max=0;
		char maxChar=' ';
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
				continue;
			}
			int count=1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
					ch[j]=' ';
				}
			}
			if(count>max) {
				max=count;
				maxChar=ch[i];
			}
		}
		System.out.println(maxChar+"="+max);
	}

}
