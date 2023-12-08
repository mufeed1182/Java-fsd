package aaaa;

import java.util.Scanner;

public class LuckyPrize4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=0;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			num=(num*10)+digit;
			sum+=digit;
			n/=10;
		}
		if(num==n || sum%2==0) {
			System.out.println("Winner");
		}else {
			System.out.println("Not a Winner");
		}

	}

}
