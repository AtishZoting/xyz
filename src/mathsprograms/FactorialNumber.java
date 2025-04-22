package mathsprograms;

public class FactorialNumber {
	public static void main(String[] args) {
		
		//factorail manje 5 chya aadhichya saglya number chi multiplication karun ans yeil tyala mantat
		
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
