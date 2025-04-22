package stringprograms;

public class SwappingByWord {

	public static void main(String[] args) {
		String s= "my name is ajit";
		String []str=s.split(" ");
		
		for(int i=0;i<str.length;i+=2) {
			String temp=str[i];
			str[i]=str[i+1];
			str[i+1]=temp;
		}
		for(String st:str) {
			System.out.print(st+" ");
		}
	}

}
