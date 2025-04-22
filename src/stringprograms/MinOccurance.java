package stringprograms;

public class MinOccurance {

	public static void main(String[] args) {
		String s="aaabbbbcdddddeeeeeeff";
		char[]ch=s.toCharArray();
		int min=s.length();
		char minChar=' ';
		
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
			if(count<min) {
				min=count;
				minChar=ch[i];
			}
		}
		System.out.println(minChar+"="+min);
	}

}
