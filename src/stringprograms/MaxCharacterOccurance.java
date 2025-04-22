 package stringprograms;

public class MaxCharacterOccurance {

	public static void main(String[] args) {
		String s="testiiing";
		char[]ch=s.toCharArray();
		char maxChar=' ';
		int maxCount=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(c==ch[j]) {
					count++;
					ch[j]=0;
				}
			}
			if(count>maxCount) {
				maxCount=count;
				maxChar=c;
			}
		}
		System.out.println(maxChar+" "+maxCount);
	}

}
