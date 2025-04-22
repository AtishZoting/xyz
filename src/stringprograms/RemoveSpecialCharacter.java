package stringprograms;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		String s = "Testin@g#te&st";
		//out put= Testingtest
		
		String sp = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				sp = sp + s.charAt(i);
			}
		}
		System.out.println(sp);
		
		
		
		//output= TestinXgXteXst;
		/*
		 String s="Testin@g#te&st";
		    String sp="";
		for(int i=0;i<s.length();i++ ){
		    if(Character.isLetter(s.charAt(i))==false){
		        sp=sp+"X";
		    }else
		    sp=sp+s.charAt(i);
		}
		    System.out.println(sp);*/
	}

}
