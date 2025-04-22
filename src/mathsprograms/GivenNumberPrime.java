package mathsprograms;

public class GivenNumberPrime {
public static void main(String[] args) {
	int num=28;
	int count=0;
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			count++;
		}
		
	}
	if(count==0) {
		System.out.print("Given number is Prime "+num);
	}else
		System.out.print("Given number is not Prime "+num);
}
}
