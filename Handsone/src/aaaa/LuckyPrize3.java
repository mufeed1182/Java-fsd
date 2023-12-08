package aaaa;

import java.util.Scanner;

public class LuckyPrize3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count4=0;
		int count7=0;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum+=digit;
			if(digit==4) {
				count4++;
			}else if(digit==7) {
				count7++;
			}else {
				System.out.println("Not a Winner");
				System.exit(0);
			}
			n/=10;
		}
		if (count4>count7 && sum%2!=0) {
			System.out.println("Winner");
		}else {
			System.out.println("Not a Winner");
		}

	}

}
