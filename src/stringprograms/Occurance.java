package stringprograms;

public class Occurance {
	public static void main(String[] args) {
		String t="testing testing shastra";
		String s=t.replaceAll(" ", "");//11
		char[]ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(c==ch[j]) {
					count++;
					ch[j]=0;
				}
			}
			if(count>0) {
				System.out.println(c+"="+count);
			}
		}
	}

}
