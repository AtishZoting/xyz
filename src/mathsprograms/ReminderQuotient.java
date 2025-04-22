package mathsprograms;

public class ReminderQuotient {

	public static void main(String[] args) {

		int a=15;
		int b=10;
		
		int rem=a; //moti value assign karaychi
		int quo=0;
		
		while(rem>=b) //1ahan value sobot iterte karaycha
		{
			rem=rem-b;//yani kiti vela minus hotil te bagen
			quo++;   // yani kiti vela to minus hot gela te quo madhe add hot jael
		}
		
		System.out.println("reminder is "+rem);
		System.out.println("Quotient is "+quo);
	}

}
