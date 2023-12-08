package Module_1_Handsone;

import java.util.Scanner;

public class GreekForGeeks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=0;
		int i=0;
		while(n>0) {
			if(isPrime(i) && i>n) {
				num=i;
				break;
			}
			i++;
		}
		System.out.println(num);

	}
	
	public static boolean isPrime(int n) {
		
		if (n<2) {
			return false;
		}
		if(n==2) {
			return true;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0 && n!=i) {
				 return false;
			}
		}
		return true;
	}

}
