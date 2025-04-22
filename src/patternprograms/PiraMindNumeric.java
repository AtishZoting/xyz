package patternprograms;

public class PiraMindNumeric {

	public static void main(String[] args) {
		int num=1;;
		
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
//        1
//       1 2
//      1 2 3
//     1 2 3 4
//    1 2 3 4 5
//

//     1
//    2 2
//   3 3 3
//  4 4 4 4
// 5 5 5 5 5    only change k loop, k chya print statement madhi i pass karaycha
//